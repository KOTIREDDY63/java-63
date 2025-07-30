package Banking;

public class bankaccount {
 public static void main(String[] args) {
    String AccountHolderName = "Koti reddy";
    double AccountBalance = 100000.00;
    double DepositeAmount=5000.00;
    int NumberOfTransactions = 6;

    //Arithmetic: Update the balance after deposit and withdrawal.
    AccountBalance = AccountBalance + DepositeAmount; // Deposit
    //Relational: Check if balance is below minimum threshold.
    boolean isBalanceBelowThreshold = AccountBalance < 1000.00;
    //Logical: Verify if deposit is valid and account is active.
    boolean isDepositValid = DepositeAmount > 0 && !isBalanceBelowThreshold;
    //increment: Increase number of transactions with each operation
    NumberOfTransactions++;
    //prints
    System.out.println("Account Holder Name: " + AccountHolderName);
    System.out.println("Account Balance: " + AccountBalance);
    System.out.println("Number of Transactions: " + NumberOfTransactions);


 }
}
