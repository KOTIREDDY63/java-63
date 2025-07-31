//scanner class is used to take input from the user
// It is part of the java.util package, so we need to import it
//nextInt() is used to take integer input from the user
//nextLine() is used to take string input from the user
// next() is used to take a single word input from the user
// nextDouble() is used to take double input from the user
// nextBoolean() is used to take boolean input from the user
// nextFloat() is used to take float input from the user
// nextShort() is used to take short input from the user
//user choice is taken using switch case

package userinput;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // Taking string input from the user
        System.out.println("Your name is: " + name);
        
   System.out.println("welcome " + name );
     System.out.println("Enter your age:");
     Scanner sc1 = new Scanner(System.in);
     int age = sc1.nextInt(); // Taking integer input from the user
     System.out.println("Your age is: " + age);

     if (age>=18){
        System.out.println("you are elgible to vote");
     }
     else{
System.out.println("you are not elgible to vote");
     }
 }
}
