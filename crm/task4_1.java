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

        // ✅ Calculate average sale value
        double averageSale = (interactions > 0) ? totalPurchase / interactions : 0;

        // ✅ Determine customer status
        String status;
        if (totalPurchase >= 50000) {
            status = "Platinum";
        } else if (totalPurchase >= 25000) {
            status = "Gold";
        } else if (totalPurchase >= 10000) {
            status = "Silver";
        } else {
            status = "Bronze";
        }

        // ✅ Check activity using ternary operator
        String activity = (interactions < 5) ? "Inactive Customer" : "Active Customer";

        // ✅ Display Results
        System.out.println("\n--- Customer Summary ---");
        System.out.println("Customer ID         : " + customerId);
        System.out.println("Customer Name       : " + name);
        System.out.println("Total Purchase (₹)  : " + totalPurchase);
        System.out.println("Total Interactions  : " + interactions);
        System.out.println("Average Sale (₹)    : " + averageSale);
        System.out.println("Customer Status     : " + status);
        System.out.println("Activity Status     : " + activity);

        sc.close();
    }
}
