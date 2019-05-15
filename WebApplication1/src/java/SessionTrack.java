
import javax.servlet.http.*;
import java.io.*;
public class SessionTrack extends HttpServlet
{
    
public void doGet(HttpServletRequest request ,HttpServletResponse response)
{
    response.setContentType("text/html");
    try
    {
     PrintWriter pw=response.getWriter();
     HttpSession session=request.getSession();
     session.setMaxInactiveInterval(1*60);
     pw.println("<html><body>");
     pw.println(session.getId());
     if(session.isNew())
     {
         pw.println("Welcome user");
     }
     else
         pw.println("Welcome back");
      pw.println("</html></body>");
      pw.close();
      
    }
    catch(Exception ex)
    {
        System.out.println(ex);
    }
}
}