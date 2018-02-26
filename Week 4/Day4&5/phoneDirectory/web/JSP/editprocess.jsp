<%-- 
    Document   : editprocess
    Created on : Feb 26, 2018, 10:03:38 PM
    Author     : cb-goutham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "phoneDirectory.*" %>
<%@page import ="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
               Contacts contact = new Contacts();
               contact.setFname(request.getParameter("firstname"));
               contact.setLname(request.getParameter("lastname"));
               contact.setAddress(request.getParameter("address"));
               contact.setAddline2(request.getParameter("addline2"));
               contact.setCity(request.getParameter("city"));
               contact.setState(request.getParameter("state"));
               contact.setCountry(request.getParameter("country"));
               contact.setZip(request.getParameter("zip"));
               contact.setMobile(request.getParameter("mobile"));
               contact.setHome(request.getParameter("home"));
               contact.setWork(request.getParameter("work"));
               
               
               
              int status = EditContacts.edit(contact);
              
                if(status > 0)
                {
                             out.println("<script type=\"text/javascript\">");
                             out.println("alert('Contact updated Successfully');");
                             out.println("location='../index.html';");
                             out.println("</script>");
                }
                else
                {
                             out.println("<script type=\"text/javascript\">");
                             out.println("unable to update Contact');");
                             out.println("location='../index.html';");
                             out.println("</script>");
                }              
            %>
    </body>
</html>
