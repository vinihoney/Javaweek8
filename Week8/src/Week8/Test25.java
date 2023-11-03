package Week8;
/* 25. Declare one method with return type and parameter and print your name in console. */
import java.util.Scanner;

public class Test25 {
    public static void main(String[] args) {
        String name = "Sonal from Code2";
        System.out.println(name);  // Call the method and print your name

    }

    // A method that takes a String parameter and returns void (no return value)
    public static void printMyName(String name) {
        System.out.println("My name is: " + name);
    }
}
