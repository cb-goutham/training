<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Self Service Portal</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./CSS/login.css">

        <script>
         function validate()
        {
            
            var email = document.frm2.Email.value;
            var password = document.frm2.Password.value;
            if(email === "")
            {
                alert("Email Cannot be blank");
                return false;
            }
            if(password === "")
            {
                alert("Password Cannot be blank");
                return false;
            }
        }
        </script>
    </head>
    <body>
        <%
            String email = (String)session.getAttribute("email");
            if(email != null)
            {
                response.sendRedirect("JSP/welcome");
            }
      
        %>
                   
        <div margin:0 auto;width:75%;text-align:left">
            
        <form action ="JSP/LoginProcess" method ="post" onsubmit="return validate();" name ="frm2">
            <h1 style="font-family: 'Arial';font-size: 40px">Space Portal </h1>
            <h3>Login </h3>
            <input type ="email" name ="Email" placeholder ="Email" /><br/>
            <input type ="password" name ="Password" placeholder="Password" /><br/>
            <input class="button2" type ="submit" name="Submit" value ="Login" /><br/>
            <input class="button" type="button" name ="Signup" value ="New Around here?" onclick ="location.href='JSP/Signup';"/><br/>
        </form>
        <div/>
    </body>
</html>
