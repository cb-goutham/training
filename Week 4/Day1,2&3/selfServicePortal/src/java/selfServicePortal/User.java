/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cb-goutham
 */
package selfServicePortal;
public class User {
    private String fname;
    private String lname;
    private String email;
    private String password;
    private String address;
    
    public void setFname(String fname)
    {
        this.fname = fname;
    }
    public void setLname(String lname)
    {
        this.lname = lname;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getFname()
    {
        return this.fname;
    }
    public String getLname()
    {
        return this.lname;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getAddress()
    {
        return this.address;
    }  
}
