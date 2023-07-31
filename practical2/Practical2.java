package com.mycompany.practical2;
public class Practical2 {

    public static void main(String[] args) {
        Item item = new Item(28923, "item no 1");
        Monster monster = new Monster(2001, "Monster A");

        System.out.println("Item Location: " + item.getLocation());
        System.out.println("Item Description: " + item.getDescription());

        System.out.println("Monster Location: " + monster.getLocation());
        System.out.println("Monster Description: " + monster.getDescription());
    }
}



/*
part 2

1.Which of these keywords is used to refer to member of base class from a sub class?
b) super

2.The modifier which specifies that the member can only be accessed in its own class is
b) private	 	

3.Which of these is a mechanism for naming and visibility control of a class and its content?
b) Packages

4.Which of the following is correct way of importing an entire package ‘pkg’?
c) import pkg.*	

5.Which of these method of class String is used to extract a single character from a String object?
c) charAt()

6.Which of these method of class String is used to obtain length of String object?
d) length()



*/

/*
PART 03
Real-world objects contain //state and //behavior.
A software object's state is stored in //instance variables.
A software object's behavior is exposed through //methods.
Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data //encapsulation.
A blueprint for a software object is called a //class.
Common behavior can be defined in a //base class and inherited into a //derived class using the //extends keyword.
A collection of methods with no implementation is called an //interface.
A namespace that organizes classes and interfaces by functionality is called a //package.
The term API stands for //Application Programming Interface.


*/