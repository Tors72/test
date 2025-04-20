//main class
import java.util.Scanner;
import java.io.*;
class main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        pu.ps("Hello, This is a test program!");
        //pu.print("Would you like to use"+"[number]program_name"+"?");
        pu.ps("Would you like to use " + "[0]menu driven program1" + "?");
        //pu.ps("Would you like to use"+"[1] menu-driven program2"+"?");
        pu.ps("[2] Run python script");
        pu.ps("Enter your choice: ");
        int c = sc.nextInt();
        switch (c) { //DO NOT SWITCH TO IF ELSE.
            case 0:
                menu.menu1();
                break;
            case 1:
                //menu.menu2();
                break;
            case 2:
                pytho.start();
                pu.ps("Running");
                break;
            default:
                pu.ps("invalid choice, try again");
                return;

        }
        sc.close();
    }
}
