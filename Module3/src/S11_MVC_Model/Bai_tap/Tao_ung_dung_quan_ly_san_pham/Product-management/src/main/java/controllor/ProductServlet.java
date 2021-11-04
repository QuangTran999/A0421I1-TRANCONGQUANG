package controllor;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();//tại sao lại new như một cái mạng, không có contructor mà?
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = (String) request.getParameter("action");
        if (action == null){
            action="";
        }
        switch (action){
            case "create":
                showCreateProduct(request, response);
                break;
            case "edit":
                showEditProduct(request, response);
                break;
            case "delete":
                showDeleteProduct(request, response);
                break;
            case "view":
                showViewProduct(request, response);
                break;
            default:
                listProduct(request, response);
                break;
        }
    }

    private void showViewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        request.setAttribute("view", product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product/view.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showDeleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        request.setAttribute("delete", product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product/delete.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showEditProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        request.setAttribute("edit", product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product/edit.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showCreateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/create.jsp");
        requestDispatcher.forward(request, response);
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = this.productService.findAll();
        request.setAttribute("products", productList);//chú ý set và get
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/list.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = (String) request.getParameter("action");
        if (action == null){
            action="";
        }
        switch (action){
            case "create":
                getCreateProduct(request, response);
                break;
            case "edit":
                getEditProduct(request, response);
                break;
            case "delete":
                getDeleteProduct(request, response);
                break;
            default:
                break;
        }
    }

    private void getDeleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.productService.remove(id);
        request.setAttribute("message", "Product was deleted.");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product/delete.jsp");
        requestDispatcher.forward(request, response);
    }

    private void getEditProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        String description = request.getParameter("description");
        String supplier = request.getParameter("supplier");
        Product product = new Product(id, name, price, description, supplier);
        this.productService.update(id, product);

        request.setAttribute("message", "Product was edited.");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product/edit.jsp");
        requestDispatcher.forward(request, response);
    }

    private void getCreateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = (int)(Math.random() * 10000);
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        String description = request.getParameter("description");
        String supplier = request.getParameter("supplier");

        Product product = new Product(id, name, price, description, supplier);
        this.productService.save(product);

        request.setAttribute("message","New message was created");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product/create.jsp");
        requestDispatcher.forward(request, response);
    }
}
