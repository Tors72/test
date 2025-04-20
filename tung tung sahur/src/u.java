import javax.swing.*;
// u stands for uouput.
//so that I don't have to use gayass system.out.println again and again. u.ps for string, u.pd for double etc.
class u {
    public static void ps(String text){
        System.out.println(text);}
    public static void pd(double text2){
        System.out.println(text2);}
    public static void pI(int text3){
        System.out.println(text3);}
    public static void pc(char text4){
        System.out.println(text4);}
    public static String msg(String text){
        JOptionPane.showMessageDialog(null, text);
        return text;
    } //ignore, do not add a return statement.
}