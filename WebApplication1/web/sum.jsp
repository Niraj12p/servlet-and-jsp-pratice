<%-- 
    Document   : sum.jsp
    Created on : Feb 24, 2019, 5:27:03 AM
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
        <h1>Hello Pooza!</h1>
        <%! int sum(int a,int b)
        {
            return a+b;
        }
        %>
        <% out.println("sum of two numbers"+sum(10,20));%>
    </body>
</html>
