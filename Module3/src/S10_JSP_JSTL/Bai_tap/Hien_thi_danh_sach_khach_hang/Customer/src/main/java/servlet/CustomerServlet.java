package servlet;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "servlet.CustomerServlet", urlPatterns = {"/list"})
public class CustomerServlet extends HttpServlet {
    List<Customer> listCustomer = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        listCustomer.add(new Customer("Tran Khanh Thi", "05-01-1999","Quang Nam", "1.jpg"));
        listCustomer.add(new Customer("Tran Nhu Quynh", "02-03-1997","Da Nang", "2.jpg"));
        listCustomer.add(new Customer("Tran Thi Trang", "14-11-1998","Quang Nam", "3.jpg"));
        listCustomer.add(new Customer("Tran Thi Tam", "15-12-1990","Quang Tri", "4.jpg"));
        listCustomer.add(new Customer("Tran Thu Suong", "23-02-1995","Quang Nam", "5.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list",listCustomer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/home.jsp");
        requestDispatcher.forward(request,response);
    }
}
