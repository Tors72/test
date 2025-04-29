//main class
import javax.swing.*;
import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        u.ps("Hello! Select a sub-program to run.");
        //pu.print("[number]program_name");
        u.ps("[0] Terminal Menu Driven Program");
        u.ps("[2] Run Python Script");
        u.ps("[3] JOptionPane GUI");
        u.ps("[4] Roll a Dice");
        u.ps("[5] Generate a Random Number");
        u.ps("[6] Organising - Arrays");
        u.ps("[7] More Organising - ArrayLists(2D)");
        u.ps("[8] For-each Loops in Arraylists");
        u.ps("[9] Money - Printf() statements");
        u.ps("[10] Cars - Objects");
        u.ps("[11] Jeremiah and Bob - Constructors");
        u.ps("[12] Fazbear - Overloaded Constructors");
        u.ps("[13] Inheritance Demonstration - Superclass and Childclasses");
        u.ps("[14] Abstraction ");
        u.ps("[15] Encapsulation + Getter n Setter Methods");
        u.ps("[16] Polymorphism Demonstration");
        u.ps("[17] Dynamic Polymorphism");
        u.ps("[18] Exception Handling - try() , catch() and finally{}");
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
                PyLoad.start();
                break;
            case 3:
                gui.start();
                break;
            case 4:
                randomno.dice();
                break;
            case 5:
                randomno.otherandom();
                break;
            case 6:
                int ch = Integer.parseInt(JOptionPane.showInputDialog("1. 1d array, 2. 2d array?, 3. obj array?"));
                if (ch == 1)
                    array.at();
                else if (ch == 2)
                    array.ar2d();
                else if (ch == 3)
                    array.arob();
                break;
            case 7:
                arraylists.start();
                break;
            case 8:
                foreachloops.start();
                break;
            case 9:
                printf.start();
                break;
            case 10:
                int i = Integer.parseInt(JOptionPane.showInputDialog("Enter number: 1 for object1, 2 for object passing "));
                if (i == 1)
                    objects.start();
                else if (i == 2)
                    objects.start2();
                break;
            case 11:
                constructor.start();
                break;
            case 12:
                OverloadedConstructors.start();
                break;
            case 13:
                inheritance.run();
                break;
            case 14:
                abstraction.run();
                break;
            case 15:
                encapsulation.run();
                break;
            case 16:
                polymorphism.run();
                break;
            case 17:
                dynpolymorphism.run();
                break;
            case 18:
                exceptionhandling.run();
                break;
            case 19:
                filehandling.run();
                break;
            case 20:
                calculator.run();
                break;
            default:
                u.ps("Invalid choice, exiting");
                System.exit(123);
        }
    }
}
