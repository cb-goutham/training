<%-- 
    Document   : signupProcess.jsp
    Created on : Feb 20, 2018, 4:07:25 PM
    Author     : cb-goutham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import = "selfServicePortal.User" %>


<%
    selfServicePortal.User user = new selfServicePortal.User();
    user.setFname(request.getParameter("FirstName"));
    user.setLname(request.getParameter("LastName"));
    user.setEmail(request.getParameter("Email"));
    user.setPassword(request.getParameter("Password"));
   
    int status = selfServicePortal.RegisterUser.Register(user);
    if(status > 0)
        out.print("SUCCESSFULLY REGISTERD");
    else
       out.print("UNABLE TO REGISTER");
 %>   
 
 <html>
     <body>
         <form action ="../index">
             <input type ="submit" name="Login" value="LOG IN"/>
         </form>
     </body>
 </html>