/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cb-goutham
 */
package phoneDirectory;
public class Contacts {
    private String fname;
    private String lname;
    private String address;
    private String addline2;
    private String city;
    private String state;
    private String country;
    private String zip;
    private String home;
    private String work;
    private String mobile;
    
    
    public void setFname(String fname)
    {
        this.fname = fname;
    }
    public void setLname(String lname)
    {
        this.lname = lname;
    }
    public void setHome(String home)
    {
        this.home = home;
    }
    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }
     public void setWork(String work)
    {
        this.work = work;
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
    public String getHome()
    {
        return this.home;
    }
    public String getWork()
    {
        return this.work;
    }
     public String getMobile()
    {
        return this.mobile;
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
