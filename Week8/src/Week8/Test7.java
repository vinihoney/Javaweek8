package Week8;
// 7. Write a java program to input any number and find out if it’s odd or even.
import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {//if stmt to decided number is divided the value by 2 then even
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
