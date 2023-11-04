package Midweek8;

import java.util.Scanner;

/* 10. Write a program to print the sum of two numbers entered by user by defining your own method. */
public class Mtest10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int n1 = scanner.nextInt();

        System.out.print("Enter Second Number : ");
        int n2 = scanner.nextInt();
        int sum = Sum(n1, n2);// call method

        System.out.println("The sum of " + n1 + " and " + n2 + " is: " + sum);
    }
       public static int Sum(int n1, int n2) { // Method to calculate the sum of two numbers
        return n1 + n2;
    }
}

