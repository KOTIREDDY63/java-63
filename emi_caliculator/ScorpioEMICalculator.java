package emi_caliculator;

public class ScorpioEMICalculator {
    public static void main(String[] args) {
        int principal = 100000; // Principal amount
        double rate = 7.5; // Annual interest rate in percentage
        int time = 5; // Time in years
        double monthlyRate = rate / (12*100); // Monthly interest rate
        int numberOfMonths = time * 12; // Total number of months
 double emi =(principal * monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths)) / 
        (Math.pow(1 + monthlyRate, numberOfMonths) - 1);
System.out.printf("The EMI for a principal amount of %d at an annual interest rate of %.2f%% for %d years is: %.2f%n",  principal, rate, time, emi);
    }

}
