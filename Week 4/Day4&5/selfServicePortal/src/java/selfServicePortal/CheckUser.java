/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfServicePortal;
import java.sql.*;


/**
 *
 * @author cb-goutham
 */
public class CheckUser {
    public static int Check(User user)
    {
        Connection con = ConnectionProvider.getconn();
       try
       {
         Statement stmt = con.createStatement();
         String query = "select * from User where email = \""+user.getEmail()+"\"";
         ResultSet rs = stmt.executeQuery(query);
         if(rs.isBeforeFirst())
             return 0;
         else
             return 1;
       }
       catch(Exception e)
       {
           
       }
      return -1;
    }
    
}
