package controllor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PatientServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
//                showNewForm(request, response);
                break;
            case "edit":
//                showEditForm(request, response);
                break;
            case "delete":
//                showDeleteUser(request, response);
                break;
            default:
                listCustomer(request, response);
                break;
        }
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<ContractDetail> listContractDetail = this.contractDetailService.selectAllContractDetail();
//        request.setAttribute("listContractDetail", listContractDetail);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
