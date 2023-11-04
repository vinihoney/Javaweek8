package Week8;

import java.util.Scanner;

/* 10. Write a java program input sales id, seller's name, sales amount, and salary basic and then
fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%  */
public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Seller's Name : ");
        String ename = scanner.nextLine();

        System.out.print("Enter Seller'S Id : ");
        int empid = scanner.nextInt();

        System.out.print("Enter Sales Amount (10,000 - 50,000) : ");
        double sales = scanner.nextDouble();

        double commission = 0.0;

        if (sales <= 50000) {
            if (sales >= 50000) {
                commission = sales * 35 / 100;
            } else if (sales >= 20000 || sales <= 30000) {
                commission = sales * 20 / 100;

            } else if (sales >= 20000 || sales <= 20000) {
                commission = sales * 10 / 100;
            } else if (sales >= 10000 || sales <= 10000) {
                commission = sales * 5 / 100;
            } else if (sales < 10000) {
                commission = sales * 2 / 100;
            }
            System.out.println("Enter Sales between 0-50000:");
        }
            System.out.println(" ______________________________________________");
            System.out.println("|                 Salary Slip                  |");
            System.out.println("|----------------------------------------------|");
            System.out.println("|    Seller's ID      : " + empid + "|");
            System.out.println("|    Seller's Name    : " + ename.toUpperCase() + "|");
            System.out.println("|----------------------------------------------|");
            System.out.println("|     Sales Amount    : " + sales + "            |");
            System.out.println("|     Basic Salary    :  " + commission + "      |");
            System.out.println("|----------------------------------------------|");
        }
    }
