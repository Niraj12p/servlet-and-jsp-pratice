
import java.sql.*;


public class selectDemo {
    public static void main(String[] args) {
        
        String Username = "admin";
        String Password = "admin";

        String url = "jdbc:mysql://localhost:3306/sdc";
        String user = "root";
        String pwd1 = "niraj";
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pwd1);
            String sql = "Select * from login where username=? and password=?";
              //String sql = "Select * from login";
            PreparedStatement st = con.prepareStatement(sql);
            //Statement st = con.createStatement();
            st.setString(1, Username);
           st.setString(2, Password);
            ResultSet rs = st.executeQuery();
           while (rs.next()) {
               System.out.print(rs.getString("username"));
               System.out.println(rs.getString("password"));
    }
           con.close();
        }
        
           catch(Exception ex)
                   {
                   System.out.println(ex);
                   }
            
}
    }
    