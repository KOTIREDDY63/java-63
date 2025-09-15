package lms;

public class tracker {
    public static void main(String[] args) {
        Student studentobj=new Student();
        studentobj.StudentId=101;
        studentobj.StudentName="RAVI";
        studentobj.StudentInfo();
        studentobj.AchivementStatus();

        trainner trainnerobj=new trainner();
        trainnerobj.trainnerID=201;
        trainnerobj.trainnerName="KUMAR";
        trainnerobj.trainnerinfo();
        trainnerobj.sessionspayment();
    }

}
