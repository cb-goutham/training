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
   
    int flag = selfServicePortal.CheckUser.Check(user);
    if(flag==0)
    {
                 out.println("<script type=\"text/javascript\">");
                 out.println("alert('Email id already in use');");
                 out.println("location='Signup';");
                 out.println("</script>");
    }
    else
    {
    int status = selfServicePortal.RegisterUser.Register(user);
    if(status > 0)
    {
                 out.println("<script type=\"text/javascript\">");
                 out.println("alert('Registered Successfully');");
                 out.println("location='../index';");
                 out.println("</script>");
    }
    else
    {
                 out.println("<script type=\"text/javascript\">");
                 out.println("unable to register');");
                 out.println("location='../index';");
                 out.println("</script>");
    }
    }
 %>   
 
 