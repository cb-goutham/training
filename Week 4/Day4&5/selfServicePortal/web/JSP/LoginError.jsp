<%-- 
    Document   : LoginError
    Created on : Feb 21, 2018, 11:40:12 AM
    Author     : cb-goutham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Error</title>
      
        
    </head>
    <body>
        
        <%
            out.println("<script type=\"text/javascript\">");
            out.println("alert('User or password incorrect');");
            out.println("location='../index';");
            out.println("</script>");
            
         %>
    </body>
</html>
