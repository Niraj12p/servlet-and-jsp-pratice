<%-- 
    Document   : test1.jsp
    Created on : Feb 24, 2019, 5:22:37 AM
    Author     : n12p
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page errorPage="error.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Pooza!</h1>
        <%
            int a=10,b=5;
            int c=a/(b-5);
            out.println(c);
          %>
    </body>
</html>
