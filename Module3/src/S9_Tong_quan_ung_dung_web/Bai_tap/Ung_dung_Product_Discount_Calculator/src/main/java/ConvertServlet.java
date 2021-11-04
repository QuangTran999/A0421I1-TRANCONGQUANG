import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConvertServlet", value = "/convert")
public class ConvertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));

        float discountAmount = (float) (price*discount*0.01);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Product Description: "+description+"<br/>");
        writer.println("List Price: "+price+"<br/>");
        writer.println("Discount Percent: "+discount+"<br/>");
        writer.println("Discount Amount: "+discountAmount+"<br/>");
        writer.println("</html>");
    }
}
