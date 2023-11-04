package Midweek8;

import java.util.Scanner;

/* 7. Take input of age of 3 people by user and determine oldest and youngest among them.  */
public class Mtest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//used scanner class to get 3 age value from user
        System.out.print("Enter the Age First Person : ");
        int age1 = scanner.nextInt();
        System.out.print("Enter the Age Second Person :");
        int age2 = scanner.nextInt();
        System.out.print("Enter the Age Third Person :");
        int age3= scanner.nextInt();
        int oldest, youngest;
        if (age1 >= age2 && age1 >= age3) { // compare all three age to find oldest
            oldest = age1;
        } else if (age2 >= age1 && age2 >= age3) {
            oldest = age2;
        } else {
            oldest = age3;
        }

        if (age1 <= age2 && age1 <= age3) {// compare all three age to find youngest
            youngest = age1;
        } else if (age2 <= age1 && age2 <= age3) {
            youngest = age2;
        } else {
            youngest = age3;
        }

        System.out.println();
        System.out.println("The oldest person is " + oldest + " years old.");
        System.out.println("The youngest person is " + youngest + " years old.");
    }
}