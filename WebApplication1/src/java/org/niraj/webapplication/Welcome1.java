package org.niraj.webapplication;

import javax.servlet.http.*;
import java.io.*;
public class Welcome1 extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
response.setContentType("text/html");
        String username=request.getParameter("uname");
        String password=request.getParameter("pwd");
        try {
            PrintWriter pw = response.getWriter();
            HttpSession session=request.getSession();
            Object value=session.getAttribute("web-name");
            if(value!=null)
            {
               
                pw.println("<html><body>");
                pw.println("<h3>Logged in as:"+value+" </h1>");
                pw.println("<h1>This is test app </h1>");
                pw.println("</html></body>"); 
            }
            else
            {
                response.sendRedirect("pooza.html");
            }
            pw.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
            }
}