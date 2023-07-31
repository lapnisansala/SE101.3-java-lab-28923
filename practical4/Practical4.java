package com.mycompany.practical4;
public class Practical4 {

    public static void main(String[] args) {
      // Create two Employee objects for Mr. Bogdan and Ms. Bird
        Employee bogdan = new Employee();
        Employee bird = new Employee();

        // Set values for Mr. Bogdan 
        bogdan.setEmpID(28923);
        bogdan.setEmpName("Bogdan");
        bogdan.setEmpDesignation("Manager");
        
        // Print details 
        System.out.println("Employee Details for Mr. Bogdan:");
        System.out.println("ID: " + bogdan.getEmpID());
        System.out.println("Name: " + bogdan.getEmpName());
        System.out.println("Designation: " + bogdan.getEmpDesignation());

        // Set values for Ms. Bird 
        bird.setEmpID(2001);
        bird.setEmpName("Bird");
        bird.setEmpDesignation("Software Engineer");

        // Print details 
        System.out.println("\nEmployee Details for Ms. Bird:");
        System.out.println("ID: " + bird.getEmpID());
        System.out.println("Name: " + bird.getEmpName());
        System.out.println("Designation: " + bird.getEmpDesignation());

    }
}
