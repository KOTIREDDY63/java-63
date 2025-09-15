package six_class;

public class Bank {
    double CurrentBalance =1000;
    public void GreetCustomer(){
        System.out.println("Welcome To The Bank");
    }
    public void depositeAmount(double Amount){
        CurrentBalance+=Amount;
        System.out.println("Amount Deposited :"+Amount);
    }
public void WithDrawlAmount(double Amount){
    CurrentBalance=-Amount;
           System.out.println("WithDrawlAmount:"+Amount); 
}
public double getCurrentBalance() {
    return CurrentBalance;
}
}
