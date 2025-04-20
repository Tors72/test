//main class
import java.util.Scanner;
import java.io.*;

class main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean run=true;
        u.ps("Hello, This is a test program!");
        //u.print("[number]program_name");
        u.ps("Would you like to use " +"\n"+"[0]terminal* menu driven program1");  //tors1
        //u.ps("Would you like to use"+"[1] menu-driven program2"+"?");
        u.ps("[2] Run python script"); //tors1
        u.ps("[3] GUI"); //tors1
        u.ps("[4] Roll a dice"); //tors1
        u.ps("[5] Random no. generator"); //tors1
        u.ps("Enter your choice: ");
        int c = sc.nextInt();
        switch (c) { //DO NOT SWITCH TO IF ELSE.
            case 0:
                menu.menu1();
                break;
            case 1:
                //menu.menu2();
                break;
            case 2:
                u.ps("executing python script");
                pytho.start();
                break;
            case 3:
                gui.gui1();
                break;
            case 4:
                randomno.dice();
                break;
            case 5:
                randomno.otherandom();
                break;
            default:
                u.ps("invalid choice, exiting");
                return;
            }
        }
    }