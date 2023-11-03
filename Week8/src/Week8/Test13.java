package Week8;

import java.util.Scanner;

/*13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to their symbol(using if else)
*/
public class Test13 {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.print("Enter First Number here: ");
        int value = number1.nextInt();

        System.out.print("Enter Second Number here: ");
        int value1 = number1.nextInt();

        System.out.print("Enter the operator here: ( +, -, /, * ): ");
        char operator = number1.next().charAt(0);
        System.out.println("You choose '" + operator + "' here :");

        int result = 0;

        if (operator == '+') {
            result = value + value1;
        } else if (operator == '-') {
            result = value - value1;
        } else if (operator == '*') {
            result = value * value1;
        } else if (operator == '/') {
            if (value1 == 0) {
                System.out.println("Division by zero is not allowed.");
                return;
            }
            result = value / value1;
        } else {
            System.out.println("Invalid operator, Please use (+, -, *, or / ).");
            return;
        }

        System.out.println("Result: " + result);
    }
}
