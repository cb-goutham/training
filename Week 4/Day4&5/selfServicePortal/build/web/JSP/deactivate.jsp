<%-- 
    Document   : deactivate.jsp
    Created on : Feb 21, 2018, 6:37:04 PM
    Author     : cb-goutham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deactivate</title>
    </head>
    <body>
        <%
            int status = 0;
            String email =(String)session.getAttribute("email");
            Connection con = selfServicePortal.ConnectionProvider.getconn();
            Statement stmt = con.createStatement();
            String query = "delete from User where email = \""+email+"\"";
            status = stmt.executeUpdate(query);
            if(status > 0)
            {
                 out.println("<script type=\"text/javascript\">");
                 out.println("alert('Account Deleted Successfully');");
                 out.println("location='../index';");
                 out.println("</script>");
                 session.invalidate();
                 
            }
            else
            {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Unable to Deactivate Account');");
                out.println("location='welcome';");
                out.println("</script>");
            }
            
            
         %>
    </body>
</html>
