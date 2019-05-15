import javax.servlet.http.*;
import java.io.*;
public  class CreateCookie extends HttpServlet {
public void doGet(HttpServletRequest request ,HttpServletResponse response)
{
    response.setContentType("text/html");
    Cookie c1=new Cookie("niraj","pooza");
    Cookie c2=new Cookie("pujan","pukar");
    c1.setMaxAge(24*60*60);
c2.setMaxAge(24*60*60);
response.addCookie(c1);
response.addCookie(c2);
try
{
    PrintWriter pw=response.getWriter();
    pw.println("<html><body><h1>Cookie has been sent</body></html>");
    pw.close();
}
catch(Exception ex)
{
    System.out.println(ex);
}
}
}