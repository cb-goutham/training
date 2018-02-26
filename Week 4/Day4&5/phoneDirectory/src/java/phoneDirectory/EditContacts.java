/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoneDirectory;

import java.sql.*;

/**
 *
 * @author cb-goutham
 */
public class EditContacts {
     public static int edit(Contacts contact)
    {
        int status = 0;
        Connection con = ConnectionProvider.getconn();
       try
       {
          String query = "update contacts set firstname = ? ,"+"lastname = ?,"+"address= ? ,"+"addline2 = ? ,"+"city = ? ,"+"state = ? ,"+"zip = ? ,"+"country = ? ,"+"home = ? ,"+"work = ? ,"+"mobile = ? "+"where firstname = ? "+"and lastname = ?";
          PreparedStatement pmt = con.prepareStatement(query);
          pmt.setString(1,contact.getFname());
        pmt.setString(2,contact.getLname());
        pmt.setString(3,contact.getAddress());
        pmt.setString(4,contact.getAddline2());
        pmt.setString(5,contact.getCity());
        pmt.setString(6,contact.getState());
        pmt.setString(7,contact.getZip());
        pmt.setString(8,contact.getCountry());
        pmt.setString(9,contact.getHome());
        pmt.setString(10,contact.getWork());
        pmt.setString(11,contact.getMobile());
         pmt.setString(12,contact.getFname());
        pmt.setString(13,contact.getLname());
        status = pmt.executeUpdate();
        
       }
       catch(Exception e)
       {
           
       }
       finally
       {
           return status;
       }
    }
}
