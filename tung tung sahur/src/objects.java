import javax.swing.*;

public class objects {
    static void start() {
        //object= instance of class. containing attributes and methods.
        //eg= phone, desk, etc. (refer to oop1)

        car mycar = new car(); // has attributes of car from object1.java THIS IS AN OBJECT!!!!!!!
        car mycar2 = new car();
        u.ps(mycar.color);
        u.ps(mycar.model);

        mycar2.color="blue"; //giving our own values, tedious process, using constructors constructor.java !!
        u.ps(mycar2.color);

        char c =(JOptionPane.showInputDialog("Want to drive? [Y/N]")).charAt(0);
        if(c=='Y'||c=='y') {
            mycar.drive();
            char brake=(JOptionPane.showInputDialog("Want to stop? [Y/N]")).charAt(0);
            if(brake=='Y'||brake=='y')
                mycar.brake();
            else
                JOptionPane.showMessageDialog(null,"You crashed.");
        }
    }
}
