import javax.swing.*;
import java.util.Locale;

public class calculator {
    static void run(){
        int res;
        int a = Integer.parseInt(u.in("Enter the first number"));
        int b = Integer.parseInt(u.in("Enter the second number"));
        char c = ((JOptionPane.showInputDialog("Enter Operation [A/S/M/D/")).toUpperCase().charAt(0));
        if(c=='A')
            res=a+b;
        else if(c=='S')
            res=a-b;
        else if (c=='M')
            res=a*b;
        else if(c=='D')
            res=a/b;
        else
            u.msg("Invalid Operation");
    }
}
