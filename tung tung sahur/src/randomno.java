import javax.swing.*;
import java.util.Random;
public class randomno {
    static void dice(){
        Random rand=new Random();
        int a=rand.nextInt(1,7);
        JOptionPane.showMessageDialog(null,"The roll of a dice gives you "+a);
    }
    static void otherandom(){
        Random rand=new Random();
        int a= Integer.parseInt(u.msg("Enter Lowest Digit"));
        int b= Integer.parseInt(u.msg("Enter Highest Digit"));
        int c=rand.nextInt(a,(b+1));
        u.msg("Random Number:"+c);
        JOptionPane.showMessageDialog(null,"Random Number:"+c);
        u.ps("test");
    }
}