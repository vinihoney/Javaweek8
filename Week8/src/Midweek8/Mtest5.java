package Midweek8;

import java.util.Scanner;

/* 5. Take two int values from user and print greatest among them. */
public class Mtest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//used scanner class to get values from user
        System.out.print("Enter first value here : ");
        int value = scanner.nextInt();
        System.out.print("Enter second value here : ");
        int value1 = scanner.nextInt();

        if (value < value1) { // compare all both value to find greatest value

            System.out.println("The greatest value " + value1);

        } else  if (value > value1) {
            System.out.println("The greatest value " + value);

        }
        System.out.println();

    }
}
