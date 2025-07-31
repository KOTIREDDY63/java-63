package crm;

import java.util.Scanner;

public class task4_1 {
    public static void main(String[] args) {
        double totalPurchase = 0.0;  
        int interactions = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer ID:");
        int customerId = sc.nextInt();  
        System.out.println("Enter Customer Name:");
        String name = sc.next();

        String more = "Y";

        while (more.equalsIgnoreCase("Y")) {
            System.out.println("Enter purchase amount (example: 200.35):");
            double purchase = sc.nextDouble();  

            totalPurchase += purchase;  

            interactions++;

            System.out.println("Do you want to add another purchase? (Y/N):");
            more = sc.next();
        }

        System.out.println("\n--- Summary ---");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + name);
        System.out.println("Total Purchase Amount: ₹" + totalPurchase);
        System.out.println("Total Interactions: " + interactions);

        sc.close();
    }
}
