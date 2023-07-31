package com.mycompany.practical4;
public class Employee 
{ 
    private int empID;
    private String empName;
    private String empDesignation;

    // Getters for empID,empName,empDesignation
    public int getEmpID() {
        return empID;
    }
    
     public String getEmpName() {
        return empName;
    }
     
    public String getEmpDesignation() {
        return empDesignation;
    }
    
    //Setters for empID,empName,empDesignation
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    } 
}
