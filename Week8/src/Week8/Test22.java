package Week8;
/* 22. Write a Java program to calculate the average value of array elements. */
public class Test22 {
    public static void main(String[] args) {
        int[] numbers= {40, 1, 67, 13, 90, 24, 15};

        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        // Calculate the average by dividing the sum by the number of elements
        int average =  sum / numbers.length;

        System.out.println("The average of the array elements is: " + average);
    }
}

