package Week8;
/*11. Input any alphabet from “A" to “F” and print their city name accordingly
(use if else) if any other alphabet should be invalid entry.*/

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet (A to F): ");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            char alphabet = input.charAt(0);

            String cityName;

            if (alphabet == 'A') {
                cityName = "Ahmedabad";
            } else if (alphabet == 'B') {
                cityName = "Baroda";
            } else if (alphabet == 'C') {
                cityName = "Calcutta";
            } else if (alphabet == 'D') {
                cityName = "Delhi";
            } else if (alphabet == 'E') {
                cityName = "Mumbai";
            } else if (alphabet == 'F') {
                cityName = "Faridabad";
            } else {
                cityName = "Invalid entry";
            }

            System.out.println("City name: " + cityName);
        } else {
            System.out.println("Invalid entry. Please enter a single alphabet.");
        }
    }
}