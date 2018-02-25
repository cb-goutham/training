<%-- 
    Document   : LoginProcess
    Created on : Feb 21, 2018, 11:14:09 AM
    Author     : cb-goutham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*"%>
<%
    String email = request.getParameter("Email");
    String pass = request.getParameter("Password");
    
    int status =0;
    Connection con = selfServicePortal.ConnectionProvider.getconn();
    try
    {
        Statement stmt=con.createStatement();
        String query = "select password,firstname from User where email = \""+email+"\"";
        ResultSet rs = stmt.executeQuery(query);
        if(!rs.isBeforeFirst())
        {
            RequestDispatcher rd=request.getRequestDispatcher("LoginError");
            rd.forward(request,response); 
        }
        while(rs.next())
        {
            if(rs.getString(1).equals(pass))
            {
                 session.setAttribute("email",email);
                 session.setAttribute("fname", rs.getString(2));              
                 response.sendRedirect("welcome");
                 
            }
            else
            {
                RequestDispatcher rd=request.getRequestDispatcher("LoginError");
                rd.forward(request,response);
            }
        }
    }
    catch(Exception e)
    {
        
    }
   
    
%>
