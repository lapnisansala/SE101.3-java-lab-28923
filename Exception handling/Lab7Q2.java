package com.mycompany.lab7q2;
public class Lab7Q2 {

    public static void main(String[] args) {
       int[] arr={1,2,3,4,5};
       
       try
       {
       int value= arr[4];
           System.out.println("5th value is" +arr[4]);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("Array index error");
       }
    }
}
