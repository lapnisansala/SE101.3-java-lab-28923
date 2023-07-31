package com.mycompany.practical2;
public class Item {
    
    //1
    protected int location;
    protected String description;
    
    //2
    // Constructor
    public Item(int location, String description) 
    {
        this.location = location;
        this.description = description;
    } 
    
    //4
    
    // Getter methods for 'location' and 'description'
    public int getLocation() 
    {
        return location;
    }
    public String getDescription() 
    {
        return description;
    }

   

    //Setter methods for 'location' and 'description'
     public void setLocation(int location) 
     {
        this.location = location;
     }
     public void setDescription(String description) 
     {
        this.description = description;
     }
}
 