package com.mycompany.practical3;
/*
public class Employee 
{
    private String name;
    private int age;
    private double salary;

    // Getters for name,age,salary
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    } 
    // Constructor to set values
        public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
    /*
    // Setters for name,age,salary
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    *     
*/

public class Employee {
    private String name;
    private double basicSalary;
    private double bonus;

    // Constructor
    public Employee(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Getter for name,basicSalary,bonus
    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
    
     public double getBonus() {
        return bonus;
    }
    
    // Setter for name,basicSalary,bonus
    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // calculate Bonus Amount (Basic Salary + Bonus)
    public double calculateBonusAmount() {
        return basicSalary + bonus;
    }
}