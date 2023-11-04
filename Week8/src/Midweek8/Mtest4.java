package Midweek8;
/* 4. Take values of length and breadth of a rectangle from user and check if it is square or not.*/

import java.util.Scanner;

public class Mtest4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your length here: ");
        double length= scanner.nextDouble();

        System.out.print("Enter your breadth here: ");
        double breadth= scanner.nextDouble();

        if(length == breadth){
            System.out.println("It is Square");
        }
        else{
            System.out.println("O...O... It's  not a Square");
        }

    }
}
