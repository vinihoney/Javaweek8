package Midweek8;

/* 2. Print multiplication table of 24, 50 and 29 using loop.  */
public class Mtest2 {
    public static void main(String[] args) {
        int[] numbers = {24, 50, 29};// declare array with 3 numbers
        for (int number : numbers) { //used nested loops
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
           System.out.println(); // Add an empty line between tables
        }
    }
}

