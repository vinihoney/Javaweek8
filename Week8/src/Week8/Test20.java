package Week8;

import java.util.Arrays;

/* 20. Write a Java program to sort a numeric array and a string array. */
public class Test20 {
    public static void main(String[] args) {

        int[] numericArray = {40, 1, 67, 13, 90, 24, 15};
        System.out.println("Original numeric array: " + Arrays.toString(numericArray));

        Arrays.sort(numericArray); // Sorting a numeric array
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

        // Sorting a string array
        String[] stringArray = {"Zarna", "Miten", "Ayan", "Pankti", "Sonal"};
        System.out.println("Original string array: " + Arrays.toString(stringArray));

        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }
}
