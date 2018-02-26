<%-- 
    Document   : editcontacts.jsp
    Created on : Feb 26, 2018, 7:00:53 PM
    Author     : cb-goutham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Page</title>
         <link rel="stylesheet" href="../CSS/editcontacts.css">
         <script>
         function validate()
        {
            
            var fname = document.frm2.firstname.value;
            var lname = document.frm2.lastname.value;
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
        }
        </script>
    </head>
    <body>
        <div style="width: 100%;height: 50px;background-color: #79d2a6;">
            <a href="../index.html" style="margin: 15px 50px ;position: absolute;text-decoration: none;color: white " >PhoneBook</a>
            <div style="float:right ;margin-right: 100px;margin-top: 15px">
            
            <a href ="../index.html" style="margin-left :50px;text-decoration: none;color: white" >Logout</a>
            </div>
        </div>
        
        
         <div style="margin:auto;width:75%;text-align:left">
            
        <form action ="edit.jsp" method ="post" onsubmit="return validate();" name ="frm2">
            <h1 style="font-family: 'Arial';font-size: 40px">Edit Contact</h1>
            
            <input type ="text" name ="firstname" placeholder ="FirstName" /><br/>
            <input type ="text" name ="lastname" placeholder="LastName" /><br/>
            <input class="button2" type ="submit" name="Submit" value ="Edit" /><br/>
        </form>
        <div/>
    </body>
</html>
