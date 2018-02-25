<%-- 
    Document   : logout
    Created on : Feb 21, 2018, 3:02:07 PM
    Author     : cb-goutham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout </title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("../index");
         %>
        
    </body>
</html>
