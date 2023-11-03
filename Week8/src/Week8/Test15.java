package Week8;
/* 15. Write a program that tells us input value is number or an alphabet or symbol. */
import java.util.Scanner;
public class Test15 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);//Used Scanner class

        System.out.print("Enter a character: ");
        String Input = value.next();

        if (Input.matches("[0-9]+")) {
            System.out.println(Input + " -----> is a Number.");
        } else if (Input.matches("[a-zA-Z]+")) {
            System.out.println(Input + " -----> is an Alphabet. ");
        }
    }
}