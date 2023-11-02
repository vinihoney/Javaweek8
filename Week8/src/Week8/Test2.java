package Week8;
/* 2. Declare array and store any 5 countries and print them in console.*/
public class Test2 {
    public static void main(String[] args) {
       String[] text = {"India", "England", "France", "Germany", "Portugal"};
       /* System.out.println(text[0]);
        System.out.println(text[1]); // Calling data from its index number
        System.out.println(text[2]);
        System.out.println(text[3]);
        System.out.println(text[4]);*/
        int i;
        for (i = 0; i <= 4; i++) { //used for loop to reduce coding
            System.out.println(text[i]);
        }
    }
}
