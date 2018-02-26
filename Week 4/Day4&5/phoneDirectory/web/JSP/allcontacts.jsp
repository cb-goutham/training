<%-- 
    Document   : allcontacts
    Created on : Feb 26, 2018, 4:03:08 PM
    Author     : cb-goutham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<%@page import ="phoneDirectory.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All contacts</title>
        <link rel="stylesheet" href="../CSS/allcontacts.css">
    </head>
    <body>
        <div style="width: 100%;height: 50px;background-color: #79d2a6;">
            <a href="../index.html" style="margin: 15px 50px ;position: absolute;text-decoration: none;color: white " >PhoneBook</a>
            <div style="float:right ;margin-right: 100px;margin-top: 15px">
            
            <a href ="../index.html" style="margin-left :50px;text-decoration: none;color: white" >Logout</a>
            </div>
        </div>
            <h1>All Contacts</h1>
        <table>
            <thead>
            <tr class= "border">
                <th colspan = "2" >Name</th>
                <th colspan="6">Address</th>
                <th colspan="3">Phone</th>
            </tr>
            <thead>
            <tbody>
            <%
               
                Connection con = ConnectionProvider.getconn();
               try
               {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from contacts");
                while(rs.next())
                {
                    out.println("<tr class= 'border' >");
                    out.println("<td>"+rs.getString("firstname")+"</td>");
                    out.println("<td>"+rs.getString("lastname")+"</td>");
                    out.println("<td>"+rs.getString("address")+"</td>");
                    out.println("<td>"+rs.getString("addline2")+"</td>");
                    out.println("<td>"+rs.getString("city")+"</td>");
                    out.println("<td>"+rs.getString("state")+"</td>");
                    out.println("<td>"+rs.getString("zip")+"</td>");
                    out.println("<td>"+rs.getString("country")+"</td>");    
                    int cnt=0;
                    if(rs.getString("home").length() > 0)
                    {
                        out.print("<td>");
                        out.println(rs.getString("home")+"(HOME)");
                        out.println("</td>");
                        cnt++;
                    }
                     
                    if(rs.getString("work").length() > 0)
                    {
                       out.print("<td>"); 
                       out.println(rs.getString("work")+"(WORK)");
                       out.println("</td>");
                       cnt++;
                    }
                    
                    if(rs.getString("mobile").length() > 0)
                    {
                        out.print("<td>");
                        out.println(rs.getString("mobile")+"(MOBILE)"); 
                        out.println("</td>");  
                        cnt++;
                    }
                    while(cnt<3)
                    {
                        out.println("<td></td>");
                        cnt++;
                    }
                    out.println("</tr>");
                    
                    
                }
                
               }
               catch(Exception e)
               {
                   
               }
                
            %>
            </tbody>
        </table>
        
    </body>
</html>
