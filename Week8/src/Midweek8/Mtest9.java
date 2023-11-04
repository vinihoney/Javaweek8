package Midweek8;
/* 8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.

9. Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly. */

import java.util.Scanner;

public class Mtest9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of classes held : 260");

        System.out.print("Enter Your name: ");
        String name = (scanner.nextLine().toUpperCase());

        System.out.print("Do you have a medical reason? (Y / N): ");
        String medicalReason = scanner.nextLine().toUpperCase();// wanted to use char but didn't work

        if (medicalReason.equals("Y")) {
            System.out.println(name + " has a medical reason and is exempt from attendance requirements.");
        } else if (medicalReason.equals("N"))
            System.out.print("Number of classes attended : ");
        int attend = scanner.nextInt();
        {

            if (attend >= 1 && attend <= 260) {
                int percentage = (attend * 100 / 260);
                System.out.println("percentage of class attended :" + percentage + "%");

                if (percentage >= 75) {
                    System.out.println(name + " is allowed to sit in exam :" + percentage + "%");
                } else {
                    System.out.println(name + " is not allowed to sit in exam :" + percentage + "%");
                    System.out.println("Try harder next time... BEST OF LUCK.");
                }
            } else {
                System.out.println("It's not valid...Attend class value should be < 260.");
            }

        }

    }

}