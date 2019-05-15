
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
public class NewServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
response.setContentType("text/html");
        String n=request.getParameter("name");
        String a=request.getParameter("address");
        try {
            PrintWriter printWriter = response.getWriter();
            printWriter.println("<html><body>");
            printWriter.println("<h1>Hello"+n+"</h1>");
            printWriter.println("<h2>You are from" + a + "</h2>");
            printWriter.println("</body></html>");
            printWriter.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        }
    }