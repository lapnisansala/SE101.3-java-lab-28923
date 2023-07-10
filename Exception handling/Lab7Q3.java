package com.mycompany.lab7q3;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class Lab7Q3 {

    public static void main(String[] args) {
        String filePath="C:\\Users\\HP\\Desktop\\lab github\\SQL.txt";
        File file=new File(filePath);
        try
        {
            Scanner sc=new Scanner(file);
            while (sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File cannot found");
        }
    }
}
