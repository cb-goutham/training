<%-- 
    Document   : Signup.jsp
    Created on : Feb 20, 2018, 12:39:38 PM
    Author     : cb-goutham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="../CSS/signup.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up Page</title>
        <script>
        function validate()
        {
            
            var fname = document.frm1.FirstName.value;
            var lname = document.frm1.LastName.value;
            var email = document.frm1.Email.value;
            var confEmail = document.frm1.ConfirmEmail.value;
            var pass = document.frm1.Password.value;
            var confPass = document.frm1.ConfirmPassword.value;
            if(fname === "")
            {
                alert("First Name Cannot be blank");
                return false;
            }
            if(lname === "")
            {
               alert("Last Name Cannot be blank");
                return false; 
            }
            if(email === "")
            {
                alert("Email Cannot be blank");
                return false;
            }
            if(confEmail === "")
            {
                alert(" Confrim Email Cannot be blank");
                return false;
            }
            if(pass != confPass)
            {
                alert("Passwords doesnot Match ");
                return false;
            }
            if(email != confEmail)
            {
                 alert("Emails doesnot Match ");
                return false;
            }
            if(pass.length < 6)
            {
                 alert("Password must contain atleast 6 characters ");
                return false;
            }
            
           
        }
    </script>
    </head>
    
    <body>
        <div>
        <form action = "signupProcess"name ="frm1" method="post" onsubmit="return validate();">
            <h3>Register to</h3>
            <h2 style ="font-family: Arial">Space Portal</h2>
            <input type="text" name ="FirstName" placeholder ="First Name "  />
            <input type="text" name ="LastName" placeholder ="Last Name "  /><br/>
            <input type="email" name ="Email" placeholder ="Email "  />
            <input type="email" name ="ConfirmEmail" placeholder ="Confirm Email "  /><br/>
            <input type="password" name ="Password" placeholder ="Password"  />
            <input type="password" name ="ConfirmPassword" placeholder ="Confirm Password"  /><br/>
            <input class ="button" type ="submit" name ="submit" value="Create an account"/><br/>
            <a href="../index.jsp">Have already an account?</a>
        </form>
        </div>
    </body>
</html>
