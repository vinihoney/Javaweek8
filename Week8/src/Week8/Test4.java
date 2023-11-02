package Week8;

import java.util.Scanner;

//4. Write if else condition and print your group name in console else others group name
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter group name: ");
        String groupName = scanner.nextLine();

        String myGroupName = "Code2";

        if (groupName.equals(myGroupName)) {
            System.out.println("Our group name is : " + groupName);
        } else {
            System.out.println("Other group name is: " + groupName);
        }
    }
}
