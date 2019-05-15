<%-- 
    Document   : date1.jsp
    Created on : Feb 24, 2019, 5:06:56 AM
    Author     : n12p
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.*"%>
<html>
    <body>
        <h1>Hello Pooza</h1>
        <%
            Date d=new Date();
            out.println(d);
         %>
    </body>
</html>
