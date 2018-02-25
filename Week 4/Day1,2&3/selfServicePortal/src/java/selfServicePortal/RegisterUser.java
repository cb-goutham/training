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
public class RegisterUser {
    public static int Register(User user)
    {
        int status = 0;
        Connection con = ConnectionProvider.getconn();
       try
       {
        PreparedStatement pmt = con.prepareStatement("insert into User (firstname,lastname,email,password) values(?,?,?,?)");
        pmt.setString(1,user.getFname());
        pmt.setString(2,user.getLname());
        pmt.setString(3,user.getEmail());
        pmt.setString(4,user.getPassword());
        status = pmt.executeUpdate();
       }
       catch(Exception e)
       {
          System.out.println(e);
       }
        return status;
    }
}
