package Week8;

import java.util.Scanner;
/* 1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :) */
/* Ternary operator: There is also a short-hand if else, which is known as the ternary operator
because it consists of three operands.
It can be used to replace multiple lines of code with a single line,
and is most often used to replace simple if else statements:
Syntax: variable = (condition) ? expressionTrue :  expressionFalse
*/
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "even" : "odd"; //used ternary operator (? :)

        System.out.println("The entered number is " + result + ".");
    }
}
