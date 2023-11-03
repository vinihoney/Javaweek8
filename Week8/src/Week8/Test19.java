package Week8;

import java.util.Scanner;

/* 19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
Ref: 8. Write a java program to get numbers from users and print whether it is positive or negative.
     12. Same as above program-8 using switch statement  */
public class Test19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        String result ;

        switch (Integer.signum(number)) {
            case -1:
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
