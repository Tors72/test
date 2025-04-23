import javax.swing.*;

public class objects {
    static void start() {
        //object= instance of class. containing attributes and methods.
        //eg= phone, desk, etc. (refer to oop1)

        car mycar = new car(); // has attributes of Car from object1.java THIS IS AN OBJECT!!!!!!!
        car mycar2 = new car();
        u.ps(mycar.color);
        u.ps(mycar.model);

        mycar2.color = "blue"; //giving our own values, tedious process, using constructors constructor.java !!
        u.ps(mycar2.color);

        char c = (JOptionPane.showInputDialog("Want to drive? [Y/N]")).charAt(0);
        if (c == 'Y' || c == 'y') {
            mycar.drive();
            char brake = (JOptionPane.showInputDialog("Want to stop? [Y/N]")).charAt(0);
            if (brake == 'Y' || brake == 'y')
                mycar.brake();
            else
                JOptionPane.showMessageDialog(null, "You crashed.");
        }
    }

    static void start2()
    {
        Car MyCar = new Car("BMW","Yellow");
        Car car2 = new Car("Tesla","Orange");
        Garage MyGarage = new Garage();
        MyGarage.park(MyCar);
        MyGarage.park(car2);
    }
}

class Car{
    String name;
    String color;

    Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
class Garage {
    void park(Car car){
        u.ps("The "+car.name+" is parked in the garage");
    }
}
