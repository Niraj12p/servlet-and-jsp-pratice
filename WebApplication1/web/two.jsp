<%-- 
    Document   : two.jsp
    Created on : Feb 24, 2019, 2:04:12 AM
    Author     : n12p
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
    </head>
    <body>
        <h1>Hello Pooza!</h1>
        
        <%//if you need to pass the value through html then we should used value attribute in setProperty%>
        <jsp:useBean id="niraj" class="org.niraj.webapplication.Person" />
        <jsp:setProperty name="niraj" property="name" />
        <jsp:setProperty name="niraj" property="salary" />
        <p> <jsp:getProperty name="niraj" property="name" /></p>
        <p><jsp:getProperty name="niraj" property="salary"/></p>
    </body>
</html>
