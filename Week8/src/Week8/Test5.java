package Week8;

import java.util.Scanner;

/* 5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format  */
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        System.out.print("Enter Student name : ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Rollno : ");
        int rollno = scanner.nextInt();

        System.out.println("Enter Marks for Maths : ");
        int maths= scanner.nextInt();
        System.out.print("Enter Marks for Science : ");
        int science= scanner.nextInt();
        System.out.print("Enter Marks for English : ");
        int english= scanner.nextInt();

        int sum;
        sum = maths + english + science;
        System.out.println("Total Marks = " + sum);
        System.out.println("------------------------------------------------");
        System.out.println("|               MARKSHEET 2023               |");
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("|                SUBJECTS----------------------");
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("|                 TOTAL------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("|                 GRADE-------------------------");
        System.out.println("------------------------------------------------");
    }
}
