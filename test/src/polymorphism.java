

public class polymorphism {  //ability of an object to identify as more than one type, car1 also identifies as a vehickle1.
    static void run(){
        Car1 car = new Car1();
        Bicycle1 bic = new Bicycle1();
        Boat boat = new Boat();
        Vehickle1[] race = {car,bic,boat};  // ***
        for(Vehickle1 v : race)
            v.go();
    }
}
abstract class Vehickle1{
    abstract void go(); }
class Car1 extends Vehickle1{
    @Override
    void go(){
        u.ps("The car picks up speed"); }
}
class Bicycle1 extends Vehickle1{
    @Override
    void go(){
        u.ps("The bicycle goes fast");
    }
}
class Boat extends Vehickle1{
    @Override
    void go(){
        u.ps("The boat picks up speed");
    }
}