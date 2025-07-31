package Task4;

import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Attendance Percentage: ");
        double attendance = sc.nextDouble();

        int totalScore = 0;
        int numberOfSubjects = 0;
        boolean addMore = true;
        while (addMore) {
            System.out.print("Enter subject score: ");
            int score = sc.nextInt();
            totalScore += score;
            numberOfSubjects++;
            System.out.print("Do you want to add another subject? (y/n): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("y")) {
                addMore = false;
            }
        }

        double average = (numberOfSubjects > 0) ? (double) totalScore / numberOfSubjects : 0;
        String performance;
        if (average >= 85) {
            performance = "Excellent";
        } else if (average >= 70) {
            performance = "Good";
        } else if (average >= 50) {
            performance = "Average";
        } else {
            performance = "Needs Improvement";
        }

        System.out.println("\n--- Student Report ---");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Attendance: " + attendance + "%");
        if (attendance < 75) {
            System.out.println("Warning: Attendance is below 75%!");
        }
        System.out.println("Total Score: " + totalScore);
        System.out.println("Number of Subjects: " + numberOfSubjects);
        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Performance Level: " + performance);
        sc.close();
        System.out.println("Thank you for using the Student Report System!");
        
    }
}
