import javax.swing.*;

public class dynpolymorphism { //dyanmic = during runtime , ability of obj to take many forms while prog running
    static void run() {
        Animal animal;
        while (true) {
            int i = Integer.parseInt(JOptionPane.showInputDialog("Enter animal name(1=dog,2=cat):"));
            if (i == 1) {
                animal = new Dog();
                animal.speak();
                break;
            } else if (i == 2) {
                animal = new Cat();
                animal.speak();
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input");
                return;
            }
        }
    }
}


abstract class Animal{ abstract void speak();}

class Dog extends Animal{
    @Override
    void speak(){JOptionPane.showMessageDialog(null,"woof woof");}
}
class Cat extends Animal{
    @Override
    void speak(){JOptionPane.showMessageDialog(null,"meow meow");}
}
