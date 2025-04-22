//main class
import javax.swing.*;
import java.util.Scanner;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        u.ps("Hello! Select a sub-program to run.");
        //pu.print("[number]program_name");
        u.ps("[0]Terminal Menu Driven Program");
        u.ps("[2] Run Python Script");
        u.ps("[3] JOptionPane GUI");
        u.ps("[4] Roll a Dice");
        u.ps("[5] Generate a Random Number");
        u.ps("[6] Organising - Arrays");
        u.ps("[7] Even More Organising - ArrayLists(2D)");
        u.ps("[8] For-each Loops in Arraylists");
        u.ps("[9] Money - Printf() statements");
        u.ps("[10] Cars - Objects");
        u.ps("[11] Jeremiah and Bob - Constructors");
        u.ps("[12] Fazbear - Overloaded Constructors");
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
                gui.start();
                break;
            case 4:
                randomno.dice();
                break;
            case 5:
                randomno.otherandom();
                break;
            case 6:
                int ch=Integer.parseInt(JOptionPane.showInputDialog("1. 1d array, 2. 2d array?"));
                if(ch==1)
                        array.at();
                else if(ch==2)
                    array.ar2d();
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
                objects.start();
                break;
            case 11:
                constructor.start();
                break;
            case 12:
                ocons.start();
                break;
            default:
                u.ps("invalid choice, exiting");
            }
        }
    }
