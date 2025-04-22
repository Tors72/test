//main class
import javax.swing.*;
import java.util.Scanner;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        u.ps("Hello, This is a test program!");
        //pu.print("[number]program_name");
        u.ps("Would you like to use " +"\n"+"[0]terminal* menu driven program1");  //tors1
        //pu.ps("Would you like to use"+"[1] menu-driven program2"+"?");
        u.ps("[2] Run python script"); //tors1
        u.ps("[3] GUI"); //tors1
        u.ps("[4] Roll a dice"); //tors1
        u.ps("[5] Random no. generator"); //tors1
        u.ps("[6] Arrays");
        u.ps("[7] ArrayLists(2D)");
        u.ps("[8] For-each Loops in Arraylists");
        u.ps("[9] Printf() statements");
        u.ps("[10] Objects");
        u.ps("[11] Constructors");
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

            default:
                u.ps("invalid choice, exiting");
            }
        }
    }
