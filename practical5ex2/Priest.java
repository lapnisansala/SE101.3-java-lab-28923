package com.mycompany.practical5ex2;
public class Priest implements Speaker
{
    @Override
    public void speak(String pharase)
    {
        System.out.println("Priest: "+pharase);
    }
    
}
