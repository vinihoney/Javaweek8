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

        System.out.print("Enter Marks for Maths (0-100) : ");
        int maths= scanner.nextInt();
        if (maths< 0 || maths > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100.");
            return;

        }
        System.out.print("Enter Marks for Science (0-100) : ");
        int science= scanner.nextInt();
        if (science< 0 || science > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100.");
            return;
        }
        System.out.print("Enter Marks for English (0-100) : ");
        int english= scanner.nextInt();
        if (english< 0 || english > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100.");
            return;
        }
        int sum, percent;
        sum = maths + english + science;
        percent = sum / 3;

        String result;
        if (percent >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        String grade;
        if (percent >= 80) {
            grade = "A+";
        } else if (percent >= 60) {
            grade = "A";
        } else if (percent >= 50) {
            grade = "B";
        } else {
            grade = "C";
        }

        System.out.println(" ______________________________________________");
        System.out.println("|                 MARKSHEET 2023               |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|       Name           :        "+name.toUpperCase() +"|");
        System.out.println("|       Roll No        :        "+rollno+"     |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|       SUBJECTS       :          MARKS        |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|        Math          :         "+ maths +"   |");
        System.out.println("|        English       :         "+english+"   |");
        System.out.println("|        Science       :         "+science+"   |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|        TOTAL         :         "+sum+"       |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|        PERCENTAGE    :         "+percent+"   |");
        System.out.println("|        RESULT        :         "+result+"    |");
        System.out.println("|        GRADE         :         "+grade+"     |");
        System.out.println("|----------------------------------------------|");
    }

}

