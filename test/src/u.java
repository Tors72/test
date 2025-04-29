import javax.swing.*;

//so that I don't have to use gayass system.out.println again and again.
class u {
    static String ps(String text){ System.out.println(text);
        return text; } //return statement IGNORE.
    static void ps(double text){ System.out.println(text);}
    static void ps(int text){ System.out.println(text);}
    static void ps(char text){ System.out.println(text); }
    static void ps(boolean text){ System.out.println(text); }
    static String msg(String text){
        JOptionPane.showMessageDialog(null, text);
        return text; }
    static void p(String text){ System.out.print(text); }
    static void p(int text){ System.out.print(text); }
    static void p(char text){ System.out.print(text); }
    static void p(double text){ System.out.print(text); }
    static String in(String text){ JOptionPane.showInputDialog(null, text);
        return text;
    }
    }
// these methods are OVERLOADED!!! same name (ps) but different parameters.
// name(parameter1, parameter2) = method signature, the ones above have diff parameters hence diff method signatures.
//so I could use ps for int, string, double and char.
