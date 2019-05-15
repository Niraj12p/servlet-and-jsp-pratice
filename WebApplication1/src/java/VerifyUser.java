
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import java.sql.*;

public class VerifyUser extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        String Username = request.getParameter("uname");
        String Password = request.getParameter("pwd");

        String url = "jdbc:mysql://localhost:3306/sdc";
        String user = "root";
        String pwd1 = "niraj";
        try {
            PrintWriter pw = response.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pwd1);
            String sql = "Select * from login where username=? and password=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, Username);
            st.setString(2, Password);
            ResultSet rs = st.executeQuery();

           while (rs.next()) 
           {
                //if(Username.equals("admin")&&Password.equals("admin")){
                
               String a= rs.getString("username");
                String b= rs.getString("password");
                if (Username.equals(a) && Password.equals(b)) 
                {
                    HttpSession session = request.getSession();
                    session.setMaxInactiveInterval(1 * 60);
                    session.setAttribute("web-name", Username);
                    response.sendRedirect("WelcomeUser");
                }
           }
                
                //else
                //{
                    pw.println("<html><body>");
                    pw.println("<h1>Invalid User details </h1>");
                    pw.println("</html></body>");
                    RequestDispatcher rd = request.getRequestDispatcher("newhtml.html");
                    rd.include(request, response);
               // }
            //}

            pw.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
