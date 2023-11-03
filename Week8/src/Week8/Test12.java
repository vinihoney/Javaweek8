package Week8;
/* 12. Same as above program-8 using switch statement.
Ref: 8. Write a java program to get numbers from users and print whether it is positive or negative.
 */

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Using scanner
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();//declare scanner

        String result;

        switch (Double.compare(number, 0)) {
            case -1:
                //     System.out.println(number + " is Negative.");
                result = "Negative";
                break;
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "Positive";
                break;
            default:
                result = "Invalid input";
                break;
        }

        System.out.println("The number you entered is " + result);
    }
}

