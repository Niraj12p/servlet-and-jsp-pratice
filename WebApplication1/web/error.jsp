<%-- 
    Document   : error.jsp
    Created on : Feb 24, 2019, 5:19:47 AM
    Author     : n12p
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page isErrorPage="true" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Pooza</h1>
        <%=exception.getMessage() %>
    </body>
</html>
