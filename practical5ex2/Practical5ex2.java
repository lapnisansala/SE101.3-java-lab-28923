package com.mycompany.practical5ex2;
public class Practical5ex2 {

    public static void main(String[] args) 
    {
      Speaker speaker1 =new Priest();
      speaker1.speak("Bless you!");
      
      Speaker speaker2 =new Politician();
      speaker2.speak("vote me!");
              
      Speaker speaker3 =new Lecturer();
      speaker3.speak("Today we are going to learn php");
    }
}
