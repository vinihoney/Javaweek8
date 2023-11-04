package Midweek8;

import java.util.Scanner;

/* 8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
  */
public class Mtest8 {
    //   public static int a;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of classes held : 260");

        System.out.print("Enter Your name: ");
        String name = (scanner.nextLine().toUpperCase());


        System.out.print("Number of classes attended : ");
        int attend = scanner.nextInt();

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
