package com.mycompany.practical5ex2;
public class Politician implements Speaker
{
    @Override
    public void speak(String pharase)
    {
        System.out.println("Politician: " +pharase);
    }
}
