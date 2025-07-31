package looping;

public class loops {
    public static void main(String[] args) {
        //for loop
        // This loop will run 5 times, from 0 to 4
        for (int i = 5; i >= 1; i--) {
            if(i==3){
                break; // This will exit the loop when i is 3
            }
            System.out.println(+i) ;
        }
        //continue statement example
        for (int i = 0; i <= 5; i++) {
            if(i==3){
                continue; // This will skip the current iteration when i is 3
            }
            System.out.println(+i) ;
        }
        //while loop
        // This loop will run as long as the condition is true
        // while (true) {
        //     System.out.println(8);   
        // }
        //do while loop
        // This loop will run at least once, even if the condition is false
        int i = 0;
        do {
            System.out.println("Hello");
            i++;
        } while (i < 5); // This will run the loop until i is less than 5
    }
}
