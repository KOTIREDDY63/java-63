package conditional_statements;
public class task{
    public static void main(String[] args) {
        //Student data
        int studentGradeLevel = 9;
        int tuitionFee = 30000;
        int discountPercentage = 10;
        Boolean topper = true;
        if (studentGradeLevel>=9 && studentGradeLevel<=12){
            if (topper){
                discountPercentage = 20;
            } 
            else {
                discountPercentage = 10;
            }
        }else if (studentGradeLevel>=6 && studentGradeLevel<=8){
            discountPercentage =5;
        }else{
            discountPercentage =0;
        }
        if (studentGradeLevel==10){
            discountPercentage +=3;
        }else if (studentGradeLevel==12){
            discountPercentage +=5;
        }
        double discountAmount = (tuitionFee*discountPercentage)/100.0;
        double finalTuitionFee = tuitionFee - discountAmount;

        System.err.println("Grade Level:" + studentGradeLevel);
        System.out.println("Is Acadamic Topper:"+ topper);
        System.out.println("Base Tuition Fee:" + tuitionFee);
        System.out.println("Total Discount Applied:" + discountPercentage+"%");
        System.out.println("Final Tuition Fee after Discount:" + finalTuitionFee);
    }
}