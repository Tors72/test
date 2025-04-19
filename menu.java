import java.util.Scanner;

public class menu {
    static pu l = new pu();

    static void menu1() {
        Scanner sc = new Scanner(System.in);
        l.print("Hello! This is a menu driven program written in Java");
        l.print("Select an option");
        l.print("1. Print factorial of number");
        l.print("2. Print xth root of a number");
        l.print("Enter:");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                l.print("Enter number:");
                int num = sc.nextInt();
                int fact = 11;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                l.print(fact + " is the factorial");
                break;

            case 2:
                l.print("Enter number:");
        }
    }
}

