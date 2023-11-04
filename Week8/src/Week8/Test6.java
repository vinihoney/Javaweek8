package Week8;

import java.util.Scanner;

/* 6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter Employee Name : ");
        String ename = scanner.nextLine();

        System.out.print("Enter Employee Id : ");
        int empid = scanner.nextInt();

        System.out.print("Enter Basic Salary : ");
        double salary= scanner.nextDouble();

        double hra = salary * 10/100;
        double ta = salary * 8/100;
        double da = salary * 9/100;
        double pf = salary * 20/100;
        double grosalary = 0;
        grosalary = salary + hra +  ta + da - pf;
        System.out.println(" ______________________________________________");
        System.out.println("|                 Salary Slip                  |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|    Employee ID      :        "+empid +"|");
        System.out.println("|    Employee Name    :        "+ename.toUpperCase()+"     |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|                                              |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|     Basic Salary     :         "+ salary +"   |");
        System.out.println("|     HRA 10%          :         "+hra+"   |");
        System.out.println("|     TA 8%            :         "+ta+"   |");
        System.out.println("|     DA 9%            :         "+da+"   |");
        System.out.println("|     PF 20%           :         "+pf+"   |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|     Gross Salary     :         "+grosalary+"       |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|----------------------------------------------|");

    }
}
