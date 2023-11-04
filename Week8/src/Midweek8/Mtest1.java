package Midweek8;

import java.util.Scanner;

/*1. Take 10 integers from keyboard using loop and print their average value on the screen. */
public class Mtest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer " + i + ": ");
            int number = scanner.nextInt();
            total += number; //Everytime it add the given number in total
        }

        double average = (double) total / 10;//total value divide by 10

        System.out.println("The average of the 10 given numbers is: " + average);
    }
}
