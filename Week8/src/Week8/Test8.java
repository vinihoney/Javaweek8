package Week8;
//8. Write a java program to get numbers from users and print whether it is positive or negative.
import java.util.Scanner;
public class Test8 {public static void main(String[] args) {
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
