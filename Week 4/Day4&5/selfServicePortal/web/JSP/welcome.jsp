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
        <link rel="stylesheet" href="../CSS/welcome.css">
    </head>
    <body>
        <%
            String email = (String)session.getAttribute("email");
            String fname = (String)session.getAttribute("fname");
            String name =null;
            if(email == null)
                response.sendRedirect("../index");
         %>  
          <div class="header">
            <a href="../index" style="margin: 15px 50px ;position: absolute;text-decoration: none;color: white " >Space Portal</a>
            <a href="welcome" style="margin: 15px 1000px ;position: absolute;text-decoration: none;color: white" >Hi,<%=fname%> </a>
            <div style="float:right ;margin-right: 100px;margin-top: 15px">
            <a href ="deactivate" style="text-decoration: none;color: white">Deactivate</a>
            <a href ="logout" style="margin-left :50px;text-decoration: none;color: white" >Logout</a>
            </div>
        </div> 
          
           <form class ="frm" action ="details" method ="post">
                <p style="font-family: Arial;font-size: 30px;text-align: center" >Welcome To Space Portal</p>
                <label for="name">Name</label> <input class="input" type ="text" name ="firstname" value=<%=fname %> readonly><br/>
                <label for="email">Email</label> <input  class ="input" type ="text" name ="email" value =<%=email %> readonly><br/>
                <input class ="button" type ="submit" name="Editdetails" value="Edit Details">
            <form/>
         
        
    </body>
</html>
