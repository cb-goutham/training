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
public class AddContacts {
    public static int add(Contacts contact)
    {
        int status = 0;
        Connection con = ConnectionProvider.getconn();
       try
       {
         
        PreparedStatement pmt = con.prepareStatement("insert into contacts (firstname,lastname,address,addline2,city,state,zip,country,home,work,mobile) values (?,?,?,?,?,?,?,?,?,?,?)");
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
        status = pmt.executeUpdate();
       }
       catch(Exception e)
       {
          System.out.println(e);
       }
       finally
       {
        return status;
       }
        
    }
    
}
