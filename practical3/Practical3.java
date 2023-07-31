package com.mycompany.practical3;

/*
public class Practical3 
{

    public static void main(String[] args) {
        
        // Using constructor to set values
       Employee emp=new Employee("pavani",21,65000.0);       
        /*
        Employee emp = new Employee();
        // Using setters to set values
        emp.setName("pavani");
        emp.setAge(21);
        emp.setSalary(65000.0);
        *

        // Using getters to retrieve values
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
        
       
    }
}
*/

public class Practical3 
{
    public static void main(String[] args) {
        // constructor
        Employee emp = new Employee("Bogdan", 50000, 10000);

        // retrieve values
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("Bonus Amount: " + emp.calculateBonusAmount());
    }
}