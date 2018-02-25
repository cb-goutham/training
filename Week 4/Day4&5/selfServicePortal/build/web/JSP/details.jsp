<%-- 
    Document   : details.jsp
    Created on : Feb 21, 2018, 3:21:47 PM
    Author     : cb-goutham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<!DOCTYPE html>
<%
    String email = (String)session.getAttribute("email");
    String name = (String)session.getAttribute("fname");
   
    if(email == null)
    {
        response.sendRedirect("../index");
    }
    String fname =null,lname =null,addr=null,addline2=null,city=null,zip=null,country=null,state=null;
    Connection con = selfServicePortal.ConnectionProvider.getconn();
    Statement stmt = con.createStatement();
    String query = "select firstname,lastname,address,addline2,city,zip,country,state from User where email = \""+email+"\"";
    ResultSet rs = stmt.executeQuery(query);
    while(rs.next())
    {
       fname = rs.getString(1);
       lname = rs.getString(2);
       addr = rs.getString(3);
       addline2=rs.getString(4);
       city=rs.getString(5);
       zip=rs.getString(6);
       country=rs.getString(7);
       state = rs.getString(8);
    }
    if(addr==null)
        addr="";
    if(addline2 == null)
        addline2="";
    if(city==null)
        city="";
    if(zip==null)
        zip="";
    if(state==null)
        state="--state--";
    if(country==null)
        country="--country--";
    
    
 %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../CSS/details.css">
    
    </head>
    <body>
       <div class="header">
            <a href="../index" style="margin: 15px 50px ;position: absolute;text-decoration: none;color: white " >Space Portal</a>
            <a href="welcome" style="margin: 15px 1000px ;position: absolute;text-decoration: none;color: white" >Hi,<%=name%> </a>
            <div style="float:right ;margin-right: 100px;margin-top: 15px">
            <a href ="deactivate" style="text-decoration: none;color: white">Deactivate</a>
            <a href ="logout" style="margin-left :50px;text-decoration: none;color: white" >Logout</a>
            </div>
        </div> 
         
        <form class ="frm" action ="editProcess" method ="post">
            <p style="font-family: Arial;font-size: 30px" >Edit Details</p>
        <label for="name">Name</label> <input class="name" type ="text" name ="firstname" value=<%=fname %> >
            <input  class ="name " type ="text" name ="lastname" value=<%=lname %> ><br/>
            <label for="email">Email</label> <input style="background-color: #9494b8" class ="input" type ="text" name ="email" value =<%=email %> readonly><br/>
        <label for="Address">Address</label><input   class = "input" type ="text" name ="address" placeholder ="Address line 1" value=<%=addr %> ><br/>
                    <input   class = "addr" type ="text" name ="addline2" placeholder ="Address line 2" value=<%=addline2 %> ><br/>
                    <input class="addr2" type="text" name ="city"  placeholder="City" value=<%=city%>>
                    <select name="state" class="name"  style="height :35px;width: 125px">
                        <option value="TamilNadu">Tamil Nadu</option>
                        <option value="AndhraPradesh">Andhra Pradesh</option>
                        <option value="Kerala">Kerala</option>
                        <option value="Rajasthan">Rajasthan</option>
                        <option value="Delhi">Delhi</option>
                        <option value =<%=state%> selected><%=state%></option>
                    <select/><br/>
                    
                    
                    
                    
                    <input class="addr2" type="text" name ="zip"  placeholder="Zip" value=<%=zip%>>
                    <select name="country" class="name"  style="height :35px;width: 125px">
                        <option value="Afghanistan">Afghanistan</option>
                        <option value="India">India</option>
                        <option value="SouthAfrica">South Africa</option>
                        <option value="Australia">Australia</option>
                        <option value="Andorra">Andorra</option>
                        <option value =<%=country%> selected><%=country%></option>
                    <select/><br/>
            <input class ="button" type ="submit" name="saveDetails" value="Save Details">
            <a style="margin: 10px;color:black" href ="welcome.jsp">Discard</a>
            
        </form>
        

    </body>
</html>
