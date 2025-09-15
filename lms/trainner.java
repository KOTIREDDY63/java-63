package lms;
import java.util.Scanner;
public class trainner {
int trainnerID;
String trainnerName;
int totalsessions;
int paymentpersession;  
int totalpayment;

public void trainnerinfo(){
    System.out.println("trainnerID:"+trainnerID);
    System.out.println("trainnerName:"+trainnerName);
}
public void sessionspayment(){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER TOTAL SESSIONS CONDUCTED:");
    totalsessions=sc.nextInt();
     paymentpersession=1500*totalsessions;
     Student studentobj=new Student();
     System.out.println("==Student traings==");
     int trainingBonus=studentobj.TrainerRating();
     int totalpayment=paymentpersession+trainingBonus;
     System.out.println("==TOTAL PAYMENT TO TRAINNER==");
        System.out.println("TOTAL PAYMENT:"+totalpayment);
        
}
}
