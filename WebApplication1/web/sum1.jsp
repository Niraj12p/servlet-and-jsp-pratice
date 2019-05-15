<%-- 
    Document   : sum1.jsp
    Created on : Feb 24, 2019, 5:32:00 AM
    Author     : n12p
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello pooza</h1>
       
        <% 
            int  a=Integer.parseInt(request.getParameter("name"));
            
            int  b=Integer.parseInt(request.getParameter("name1"));
            //out.println("sum of two numbers"+sum(a,b));
            out.println("sum="+a+b);
        %>
    </body>
</html>
