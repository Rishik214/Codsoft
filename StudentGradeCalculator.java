import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of subjects ");

        // No.of Subjects
        int n = sc.nextInt();
        System.out.println("The number of subjects = " + n);

        int total = 0;

        // Marks of each subjects and Total
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of subject " + i + ":");
            int marks = sc.nextInt();
            total += marks;
        }

        double Percentage = (double) total / (n * 100) * 100;

        System.out.println("Your Total Marks is : " + total);
        System.out.println("Your percentage is : " + Percentage);

        // Grade

        if (Percentage > 90) {
            System.out.println("Your Grade is A+");
        } else if (Percentage > 80) {
            System.out.println("Your Grade is A");
        } else if (Percentage > 70) {
            System.out.println("Your Grade is B");
        } else if (Percentage > 60) {
            System.out.println("Your Grade is C");
        } else if (Percentage > 50) {
            System.out.println("Your Grade is D");
        } else if (Percentage > 40) {
            System.out.println("Your Grade is E");
        } else {
            System.out.println("Need Improvement");
        }
    }

}
