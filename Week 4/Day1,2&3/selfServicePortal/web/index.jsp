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
        <form action ="JSP/LoginProcess" method ="post" onsubmit="return validate();" name ="frm2">
            <input type ="email" name ="Email" placeholder ="Email" /><br/>
            <input type ="password" name ="Password" placeholder="Password" /><br/>
            <input type ="submit" name="Submit" value ="Submit" /><br/>
            <p> NEW USER? </p>
            <input type="button" name ="Signup" value ="SignUp" onclick ="location.href='JSP/Signup';"/><br/>
        </form>
    </body>
</html>
