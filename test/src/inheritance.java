import javax.swing.*;

class Vehicle {
    void go(){
        JOptionPane.showMessageDialog(null,"🚗 This vehicle is moving.");
        char c= (u.msg("Would you like to hit the brakes?[Y/N]")).charAt(0);
        if(c=='y'||c=='Y'){
        stop(); }
    }
    void stop(){
       u.msg("This vehicle has stopped");
    }
}
class Bike extends Vehicle{
    int wheels = 2;
    String color ="black";
} //INHERITANCE!!!! BIKE=CHILD CLASS, VEHICLE=SUPER CLASS

public class inheritance {
    static void run() {
        Bike mybike = new Bike();
        mybike.go();
        u.ps(mybike.wheels);
        u.ps(mybike.color);
    }
}