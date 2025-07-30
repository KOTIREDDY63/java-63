package conditional_statements;

public class statements {
    public static void main(String[] args) {
        // Example of a conditional statement to check if a number is positive or negative
        // This checks if the number is greater than 0
        // If true, it prints a message indicating the number is positive
        int num =10;
        if(num>0){
            System.out.println( " This is a positive number");
        }
        else{
            System.out.println(" This is a negative number");
        }
        // Example of a conditional statement to check voting eligibility
        // This checks if the age is 18 or older
        // If true, it prints a message indicating eligibility to vote
         int age= 20;
        if(age>=18){    
            System.out.println(" You are eligible to vote");
        }
        else{
            System.out.println(" You are not eligible to vote");
        }
        // Example of a conditional expression (ternary operator) to check voting eligibility
        // This is a more concise way to write the same logic as above
        // It evaluates a boolean expression and returns one of two values based on the result
        // The syntax is: (condition) ? value_if_true : value_if_false
        String Message = (age >= 18) ? "You are eligible to vote" : "You are not eligible to vote";
        System.out.println(Message);

        //elsif ladder example
        // This is used to check multiple conditions in a sequence
        // It allows you to execute different blocks of code based on the value of a variable
        int avgScore =70;
        if(avgScore >= 90){
            System.out.println("Grade: A");
        }
        else if(avgScore >= 80){
            System.out.println("Grade: B");
        }
        else if(avgScore >= 70){
            System.out.println("Grade: C");
        }
        else if(avgScore >= 60){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }

        //switch case example
        // This is used to execute one block of code among many based on the value of a variable
        // It is an alternative to using multiple if-else statements when checking the same variable against
        int choice = 2;  
        switch(choice){
            case 1:
            System.out.println(" You chose option 1");
            break;
            case 2:
            System.out.println(" You chose option 2");      
            break;
            case 3:
            System.out.println(" You chose option 3");
            break;
            default:
            System.out.println(" Invalid choice, please try again");
            break;
        }  
        //switchcase using arrow operator
        // This is a more concise way to write switch cases introduced in Java 12
     int Age=25;
   String result = switch(Age){

        case 0,1,2,3,4,5,6,7,8,9 -> "you are a child";
        case 10,11,12,13,14,15,16,17 -> "you are a teenager";
        case 18,19 -> "you are a young adult";
        default -> "you are an adult";
     };
       
      System.out.println(result);
     
     //nested conditional statements
     // This is used to check conditions within conditions
        int number = 15;    
        if (number > 0) {
            System.out.println("The number is positive.");
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } 
            else {
                System.out.println("The number is odd.");
            }
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    
    }
    }
     
       
