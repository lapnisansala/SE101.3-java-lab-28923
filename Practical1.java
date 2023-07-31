package com.mycompany.practical1;
public class Practical1 {

    public static void main(String[] args) {
        
        //1)
        System.out.println("Hello World!");
        
        //Hello World!
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
       
      

       //3)
       //using For loop 
        for (int i = 0; i < 5; i++) {
            System.out.println("Executing Loop " + i);
        }
        
        /*  Executing Loop 0
            Executing Loop 1
            Executing Loop 2
            Executing Loop 3
            Executing Loop 4
        */

        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //using While loop
        int i = 0;
        while (i < 5) {
            System.out.println("Executing Loop " + i);
            i++;
        }
        
        /*  Executing Loop 0
            Executing Loop 1
            Executing Loop 2
            Executing Loop 3
            Executing Loop 4
        */
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
       //4)
       //using break
           
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers ){
         if( x == 30 ){
	    break;
         }
         System.out.print( x );
         System.out.print("\n");
        }
         System.out.print("I’m  out of the Loop now");
         
         
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
       
        /*10
          20
          I’m  out of the Loop now
        */
        
        //using continue    

        int [] numbers2 = {10, 20, 30, 40, 50};
        for(int x : numbers2 ){
         if( x == 30 ){
	    continue;
         }
         System.out.print( x );
         System.out.print("\n");
        }
         System.out.print("I’m  out of the Loop now");
      
         
        System.out.println("");
        System.out.println("");
        System.out.println("");
         
        /*10
          20
          40
          50
          I’m  out of the Loop now*/
        
       //5)  
         
     
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }

        System.out.println("Your grade is " + grade);
        
        
        /*Excellent!
          Your grade is A
        */
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //removing “break” command 
        
        char grade1 = 'A';

        switch (grade1) {
            case 'A':
                System.out.println("Excellent!");
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }

        System.out.println("Your grade is " + grade1);
        
        /*Excellent!
          You passed
          Better try again
          Your grade is A*/
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //same scenario by using if-else-if statement instead of switch case.
        
        
         char grade2 = 'A';

        if (grade2 == 'A') {
            System.out.println("Excellent!");
        } else if (grade2 == 'D') {
            System.out.println("You passed");
        } else if (grade2 == 'F') {
            System.out.println("Better try again");
        } else {
            System.out.println("Invalid grade");
        }

        System.out.println("Your grade is " + grade2);
        
        /*Excellent!
          Your grade is A
        */
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //6)
     /* 
        
     class TestEnhanceForLoop 
    {
   	//public static void mains(String args[])
        
        //mains-main
        public static void main(String args[])
        {
      */  


     	 int [] numbers3 = {10, 20, 30, 40, 50};
      		for(int x : numbers3 )
                {
        			 System.out.print( x );
         			//System.out.print(",")
                                
                                //missing ; 
                                System.out.print(",");
                }
        
	System.out.print("\n");
      	//String [] names ={“James”, "Larry", "Tom", "Lacy"}
        
        //“James”-"James"
        String [] names ={"James", "Larry", "Tom", "Lacy"};
     
        
      		for( String name : names ) 
                {
        		 	System.out.print( name );
         			System.out.print(",");
                //missing }
                }
        //missing }
        /*
        }
        */
    //missing }  
    
    /*
    }   
    */ 
    
    /*10,20,30,40,50,
    James,Larry,Tom,Lacy,
    */
    }
}

   