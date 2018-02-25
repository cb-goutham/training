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
    private String addline2;
    private String city;
    private String state;
    private String country;
    private String zip;
    
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
    public void setAddline2(String addline2)
    {
        this.addline2 = addline2;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public void setState(String state)
    {
        this.state = state;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public void setZip(String zip)
    {
        this.zip = zip;
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
    public String getAddline2()
    {
        return this.addline2;
    }  
    public String getCity()
    {
        return this.city;
    }  
    public String getState()
    {
        return this.state;
    }  
    public String getCountry()
    {
        return this.country;
    }  
    public String getZip()
    {
        return this.zip;
    }  
}
