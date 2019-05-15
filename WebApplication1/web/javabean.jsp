<%-- 
    Document   : one.jsp
    Created on : Feb 24, 2019, 1:56:58 AM
    Author     : n12p
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <h1>Hello Pooza</h1>
        <jsp:useBean id="niraj" class="org.niraj.webapplication.Person" />
        <jsp:setProperty name="niraj" property="name" value="pooza" />
        <jsp:setProperty name="niraj" property="salary" value="2500" />
        <p> <jsp:getProperty name="niraj" property="name" /></p>
        <p><jsp:getProperty name="niraj" property="salary"/></p>
        
    </body>
</html>
