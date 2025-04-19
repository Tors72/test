import java.util.Scanner;
class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pu.print("Hello, This is a test program!");
        //pu.print("Would you like to use "+"[number]program_name"+"?");
        pu.print("Would you like to use " + "[0]menu driven program1" + "?");
        pu.print("Enter your choice: ");
        int c = sc.nextInt();
        switch (c) {
            case 0:
                menu.menu1();
                break;
            default:
                pu.print("invalid choice");
        }
    }
}
