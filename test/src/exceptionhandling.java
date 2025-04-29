import javax.swing.*;
import java.awt.*;
import java.util.InputMismatchException;

public class exceptionhandling {
    static void run() {
        //exception= unexpected events which disrupt normal flow of program eg: division by 0
        try {
            int x = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Enter whole number to divide:"));
            int y = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Enter whole number to divide by"));
            JOptionPane.showMessageDialog(null, x / y);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,"You can't divide by zero.");
        }
        catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Enter a whole number");
        }
        finally{
            JOptionPane.showMessageDialog(null,"You are done");
            System.exit(0);
        }
    }
}
