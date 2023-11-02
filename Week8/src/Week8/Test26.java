package Week8;
//26. Write a Java program to reverse a word.
//Sample Output:
//Input a word: dsaf
//Reverse word: fasd
public class Test26 {
    public static void main(String[] args) {
        String original = "Code2 are BEST";
        String reversestr = "";
        System.out.println("Original string: " + original);
        for (int i = 0; i < original.length(); i++) {
            reversestr = original.charAt(i) + reversestr;
        }
        System.out.println("Reversed string: "+ reversestr);
    }
}

