package Midweek8;

import java.util.Scanner;

/* 11. Write a program to print a string entered by user. */
public class Mtest11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your string here : ");
        String string = scanner.nextLine();

        System.out.print("You Enetered :  '"+string +"' RIGHT.");
    }
}
