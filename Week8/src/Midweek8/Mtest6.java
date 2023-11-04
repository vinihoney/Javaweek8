package Midweek8;

import java.util.Scanner;

/* 6. A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade. */
public class Mtest6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student name : ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Rollno : ");
        int rollno = scanner.nextInt();

        System.out.print("Enter Marks for Maths : ");
        double maths = scanner.nextInt();
        System.out.print("Enter Marks for Science : ");
        double science = scanner.nextInt();
        System.out.print("Enter Marks for English : ");
        double english = scanner.nextInt();

        double sum;
        sum = maths + english + science;
        System.out.println("Your total Marks are: " + sum);

        double avg;
        avg = sum / 3;
        System.out.println("Your Average Percentage: " + avg);

        if (avg < 25) { // used if else for grading system
            System.out.println("You received grade : F");
        } else if (avg >= 25 && avg <= 45) {
            System.out.println("You received grade (25 to 45) : E");
        } else if (avg >= 45 && avg <= 50) {
            System.out.println("You received grade (45 to 50): D");
        } else if (avg >= 50 && avg <= 60) {
            System.out.println("You received grade (50 to 60) : C");
        } else if (avg >= 60 && avg <= 80) {
            System.out.println("You received grade (60 to 80): B");
        } else if (avg >= 80) {
            System.out.println("You received grade (Above 80 - A) : A");
        }

    }

}

