package lms;
import java.util.Scanner;

import userinput.scanner;

public class Student{
int StudentId;
String StudentName;
int TotalSessionsAttended;
int AttandanceCredits;
int PerformanceCredits;
int FinalCredits;
int TrainerRating;

 //Display  Student Information
 public void StudentInfo(){
   System.out.println("StudentId:"+StudentId);
   System.out.println("StudentName:"+StudentName);
 }

 //INPUTS

 //calculating attendance credits
 public int SessionsCredits() {
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER TOTAL SESSIONS ATTENDED:");
  TotalSessionsAttended = sc.nextInt();
  if (TotalSessionsAttended >= 30) {
    AttandanceCredits += 5;
    return AttandanceCredits;
  } else if (TotalSessionsAttended >= 20) {
    AttandanceCredits += 3;
    return AttandanceCredits;
  } else {
    return 0;
  }
 }

 //caluclating performance credits --->input

 public int ScoreCredits(int score){
if(score>=85){
    return PerformanceCredits=+5;
}
else if(score>=50){
    return PerformanceCredits=+3;
}
else {
    return 0;
  }
 }
 // caluclating Achivement Status
 public void AchivementStatus(){
    FinalCredits = SessionsCredits()+ScoreCredits(75); 
    if(FinalCredits>=10){
        System.out.println("==GOld==");
    }
else if (FinalCredits>=8){
     System.out.println("==SILVER==");
}
else{
    System.out.println("NEED TO IMPROVE");
}
}
//Assigned Rating to Trainer
public int TrainerRating(){
  Scanner sc = new Scanner(System.in);
  System.out.println("RATING TO TRAINER OUT OF 1-5:");
  TrainerRating = sc.nextInt();
  if (TrainerRating == 5) {
    sc.close();
    return 5000;
  } else {
    sc.close();
    return 0;
  }
}
}

