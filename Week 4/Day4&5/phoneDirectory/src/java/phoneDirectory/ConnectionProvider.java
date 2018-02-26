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
public class ConnectionProvider  {
    private static Connection con = null;
    static 
    {
        try
        {
            Class.forName(Provider.DRIVER);
            con = DriverManager.getConnection(Provider.Connection_URL,Provider.userName,Provider.password);
        }
        catch(Exception e)
                {   
                    System.out.println(e);
                    
                }
                  
    }
      public static Connection getconn()
       {
           return con;
       }
    
}
