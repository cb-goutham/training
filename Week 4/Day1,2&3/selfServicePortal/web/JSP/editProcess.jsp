<%-- 
    Document   : editProcess
    Created on : Feb 21, 2018, 3:50:20 PM
    Author     : cb-goutham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "selfServicePortal.User" %>

<%
    selfServicePortal.User user = new selfServicePortal.User();
    user.setFname(request.getParameter("firstname"));
    user.setLname(request.getParameter("lastname"));
    user.setEmail(request.getParameter("email"));
    user.setAddress(request.getParameter("address"));
   
    int status = selfServicePortal.UpdateUser.Update(user);
    if(status > 0)
    {
         
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Updated Successfully');");
            out.println("location='details';");
            out.println("</script>");   
    }
    else
    {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Unable To Update');");
            out.println("location='details';");
            out.println("</script>"); 
    }
 %>   