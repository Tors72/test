//simple menu-driven program
import java.util.Scanner;

public class menu {
    static void menu1() {
        Scanner sc = new Scanner(System.in);
        pu.ps("Hello! This is a menu driven program written in Java");
        pu.ps("Select an option");
        pu.ps("1. Print factorial of number");
        pu.ps("2. Print xth root of a number");
        pu.ps("Enter:");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                pu.ps("Enter number:");
                int num = sc.nextInt();
                int fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                pu.ps(fact + " is the factorial");
                break;

            case 2:
                pu.ps("Enter number:");
                int num2=sc.nextInt();
                pu.ps("Enter x:");
                int x=sc.nextInt();
                System.out.println(Math.pow(num2,1.0/x)+" is the xth of root of that number");
        }
        sc.close();
    }
}

