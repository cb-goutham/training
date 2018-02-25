<%-- 
    Document   : welcome
    Created on : Feb 21, 2018, 11:31:18 AM
    Author     : cb-goutham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <%
            String email = (String)session.getAttribute("email");
            String fname = (String)session.getAttribute("fname");
            String name =null;
            if(email == null)
                response.sendRedirect("../index");
         %>  
         <h1>Welcome <%=fname %> </h1>
         <form>
             <input type="button" name="logout" value="Log Out" onclick="location.href ='logout'">
             <input type ="button"name="details" value ="Edit Details" onclick ="location.href ='details'">
             <input type ="button" name="deactivate" value="Deactivate Account" onclick ="location.href='deactivate'">
         </form>
    </body>
</html>
