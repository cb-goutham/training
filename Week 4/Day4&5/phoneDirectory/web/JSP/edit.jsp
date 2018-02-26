<%-- 
    Document   : edit
    Created on : Feb 26, 2018, 7:13:06 PM
    Author     : cb-goutham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>
<%@page import ="phoneDirectory.* "%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Page</title>
        <link rel="stylesheet" href="../CSS/addcontacts.css">
        <script>
        function validate()
        {
          
            var home = document.frm1.home.value;
            var work = document.frm1.work.value;
            var mobile = document.frm1.mobile.value;
            if(mobile!=="")
            {
                if(mobile.length !== 10)
                {
                    alert("Mobile Number should be of 10 Digits");
                    return false;
                
                }
                else
                if(/^\d+$/.test(mobile)=== false)
                {
                    alert("Mobile Number should contain only numbers[0-9]");
                    return false;
                }
            }
            
             if(home!=="")
            {
                if(home.length !== 10  )
                {
                    alert("Home Number should be of 10 Digits");
                    return false;
                }
                else
                if(/^\d+$/.test(home)=== false)
                {
                    alert("Home Number should contain only numbers[0-9]");
                    return false;
                }
            }
            
             if(work!=="")
            {
                if(work.length !== 10 )
                {
                    alert("Work Number should be of 10 Digits");
                    return false;
                }
                else
                if(/^\d+$/.test(work)=== false)
                {
                    alert("Work Number should contain only numbers[0-9]");
                    return false;
                }
            }
        }
    </script>
    </head>
    <body>
        <%
            String firstname=null,lastname=null,address=null,addline2=null,city=null,state=null,zip=null,home=null,work=null,mobile=null,country=null;
            Connection con = ConnectionProvider.getconn();
            try
            {
                Statement stmt = con.createStatement();
                String query = "select * from contacts where firstname= \""+request.getParameter("firstname")+"\" and lastname = \""+request.getParameter("lastname")+"\"";
                ResultSet rs = stmt.executeQuery(query);
                if(!rs.isBeforeFirst())
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('No Contact Found');");
                    out.println("location='editcontacts.jsp';");
                    out.println("</script>");  
                }
                while(rs.next())
                {
                    firstname = rs.getString("firstname");
                    lastname = rs.getString("lastname");
                    address = rs.getString("address");
                    addline2= rs.getString("addline2");
                    city = rs.getString("city");
                   state = rs.getString("state");
                    country = rs.getString("country");
                    zip = rs.getString("zip");
                    home = rs.getString("home");
                    work = rs.getString("work");
                    mobile = rs.getString("mobile");
                }
                
                if(state=="")
                    state="--state--";
                if(country=="")
                    country = "--country--";
                
            }
            catch(Exception e)
            {
                
            }
         %>
        
        
        
        
         <div class="header">
            <a href="../index.html" style="margin: 15px 50px ;position: absolute;text-decoration: none;color: white " >PhoneBook</a>
            <div style="float:right ;margin-right: 100px;margin-top: 15px">
            
            <a href ="../index.html" style="margin-left :50px;text-decoration: none;color: white" >Logout</a>
            </div>
        </div> 
        
        
         <form class ="frm" action ="editprocess.jsp" method ="post" name ="frm1" onsubmit="return validate();">
             <p style="font-family: Arial;font-size: 30px;text-align: center" >Edit Contacts</p>
            <label for="name">Name</label> <input class="name" type ="text" name ="firstname" placeholder="First Name" value= <%=firstname%> >
                                           <input  class ="name " type ="text" name ="lastname" placeholder="Last Name" value= <%=lastname%>><br/>
            
            <label for="Address">Address</label><input   class = "input" type ="text" name ="address" placeholder ="Address line 1" value= <%=address%> ><br/>
                                                <input   class = "addr" type ="text" name ="addline2" placeholder ="Address line 2" value= <%=addline2%>><br/>
                                                <input class="addr2" type="text" name ="city"  placeholder="City" value= <%=city%>>
                                                <select name="state" class="name"  style="height :35px;width: 125px">
                                                    <option value="TamilNadu">Tamil Nadu</option>
                                                    <option value="AndhraPradesh">Andhra Pradesh</option>
                                                    <option value="Kerala">Kerala</option>
                                                    <option value="Rajasthan">Rajasthan</option>
                                                    <option value="Delhi">Delhi</option>
                                                    <option value= <%=state%> selected><%=state%></option>
                                                <select/><br/>
                    
                                                <input class="addr2" type="text" name ="zip"  placeholder="Zip" value= <%=zip%> >
                                                <select name="country" class="name"  style="height :35px;width: 125px">
                                                    <option value="Afghanistan">Afghanistan</option>
                                                    <option value="India">India</option>
                                                    <option value="SouthAfrica">South Africa</option>
                                                    <option value="Australia">Australia</option>
                                                    <option value="Andorra">Andorra</option>
                                                    <option value= <%=country%> selected><%=country%></option>
                                                <select/><br/>
            <label for="home">Phone(Home)</label><input   class = "input" type ="text" name ="home" placeholder ="PhoneNumber(Home)"  value= <%=home%>><br/>
            <label for="work">Phone(Work)</label><input   class = "input" type ="text" name ="work" placeholder ="PhoneNumber(Work)"  value= <%=work%>><br/>
            <label for="mobile">Phone(Mobile)</label><input class = "input" type ="text" name ="mobile" placeholder ="PhoneNumber(Mobile)"  value= <%=mobile%>><br/>
                
      
            <input class ="button" type ="submit" name="EditDetails" value="Save">
            <a style="margin: 10px;color:black" href ="../index.html">Discard</a>
            
        </form>
        
    </body>
</html>
