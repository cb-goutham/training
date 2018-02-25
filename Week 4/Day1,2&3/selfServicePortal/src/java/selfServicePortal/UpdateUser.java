/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfServicePortal;

import java.sql.*;

/**
 
 * @author cb-goutham
 */
public class UpdateUser {
     public static int Update(User user)
    {
        int status = 0;
        Connection con = ConnectionProvider.getconn();
       try
       {
           String fname = user.getFname();
           String lname = user.getLname();
           String email = user.getEmail();
           String addr = user.getAddress();
          String query = "update User set address = \""+addr+"\" , firstname = \""+fname+"\" , lastname = \""+lname+"\" "+"where email = \""+email+"\" ";
           Statement stmt = con.createStatement();
           status = stmt.executeUpdate(query);
       }
       catch(Exception e)
       {
          System.out.println(e);
       }
        return status;
    }
    
}
