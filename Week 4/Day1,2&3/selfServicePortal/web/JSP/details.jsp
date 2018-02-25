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
    if(email == null)
    {
        response.sendRedirect("../index");
    }
    String fname =null,lname =null,addr=null;
    Connection con = selfServicePortal.ConnectionProvider.getconn();
    Statement stmt = con.createStatement();
    String query = "select firstname,lastname,address from User where email = \""+email+"\"";
    ResultSet rs = stmt.executeQuery(query);
    while(rs.next())
    {
       fname = rs.getString(1);
       lname = rs.getString(2);
       addr = rs.getString(3);
    }
    
    
 %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EDIT DETAILS</h1>
        <form action ="editProcess" method ="post">
            FirstName <input type ="text" name ="firstname" value=<%=fname %> ><br/>
            LastName <input type ="text" name ="lastname" value=<%=lname %> ><br/>
            Email <input type ="text" name ="email" value =<%=email %> readonly><br/>
            Address <input type ="text" name ="address" value=<%=addr %> ><br/>
            <input type ="submit" name="saveDetails" value="Save Details">
            
        </form>
        
    </body>
</html>
