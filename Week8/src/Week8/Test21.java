package Week8;

import java.util.Arrays;

/* 21. Write a Java program to sum values of an array. */
public class Test21 {
    public static void main(String[] args) {

        int[] numbers= {40, 1, 67, 13, 90, 24, 15};
        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}
