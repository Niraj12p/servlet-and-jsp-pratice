import javax.servlet.http.*;
import java.io.*;
public class ReadCookie extends HttpServlet
{
    
public void doGet(HttpServletRequest request ,HttpServletResponse response)
{
    response.setContentType("text/html");
    Cookie[]c=request.getCookies();
    try
    {
        PrintWriter pw=response.getWriter();
        pw.println("<html><body>");
        if(c!=null)
        {
            for(int i=0;i<c.length;i++)
            {
                pw.println("Cookie name:"+c[i].getName());
                pw.println("<br>");
                pw.println("Cookie value:"+c[i].getValue());
                pw.println("<br>");
            }
        }
        pw.println("</html></body>");
        pw.close();
    }
    catch(Exception ex)
    {
        System.out.println(ex);
    }
}
}