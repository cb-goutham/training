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
           String addline2 = user.getAddline2();
           String city = user.getCity();
           String state = user.getState();
           String country = user.getCountry();
           String zip = user.getZip();
          String query = "update User set address = \""+addr+"\" , state = \""+state+"\" , country = \""+country+"\" , zip = \""+zip+"\" , city = \""+city+"\" , addline2 = \""+addline2+"\" , firstname = \""+fname+"\" , lastname = \""+lname+"\" "+"where email = \""+email+"\" ";
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
