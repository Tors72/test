import javax.swing.*;
public class gui{
    static void gui1() {
        int no=Integer.parseInt(JOptionPane.showInputDialog("Enter an even number under 100:"));
        if(no>100)
            JOptionPane.showMessageDialog(null, "The number is too big");
        if(no%2==0)
            JOptionPane.showMessageDialog(null,"received");
        else
            JOptionPane.showMessageDialog(null,"thats an odd number");
        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter height:"));
        if(height>=100)
            JOptionPane.showMessageDialog(null,"you are tall");
        else
            JOptionPane.showMessageDialog(null,"you are short");
    }
}