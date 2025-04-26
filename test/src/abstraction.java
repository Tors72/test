
abstract class Vehickle{  //abstract keyword does not allow for instantiation of class.
    abstract void go(); //forces us to implement this in child class Car2.
}

class Car2 extends Vehickle{
    @Override
    void go(){
        System.out.println("Driving the car."); }
}

public class abstraction {
    static void run(){
    Car2 car23 = new Car2();
    // Vehickle veh = new Vehickle();  this would not be possible.
    car23.go();
    }  //abstraction allows for a layer of security
}

