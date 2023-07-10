package com.mycompany.lab7;
import java.util.Scanner;
public class Lab7 {

    public static void main(String[] args) {
       int n1,n2,ans;
       Scanner sc=new Scanner(System.in);
       
       try
       {
           System.out.println("Enter first Number:");
           n1=sc.nextInt();
           
           System.out.println("Enter second Number:");
           n2=sc.nextInt();
           
           ans=n1/n2;
           
           System.out.println("The Answervis:"+ans);
       }  
       catch(Exception e)
       {
           System.out.println("Number Devide by Zero");
       }
           
    }
}
