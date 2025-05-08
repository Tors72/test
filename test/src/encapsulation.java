

public class encapsulation {  // + copying objects!!
    static void run(){

        //encapsulation=attributes of class being hidden or private, so that they cannot be directly accessed
        // from elsewhere, SECURITY!!!

        Vroom car = new Vroom("Chevorlet","New Model",2020);
        Vroom car2 = new Vroom("Tesla","Old Model",2020);

        System.out.println(car2); // GIVES LOCATION IN MEMORY!! FOR EG: Vroom@63961c42
        //if we do car = car2, BOTH BECOME THE SAME. SHARE THE SAME ADDRESS IN MEMORY

        car2.copy(car);

        //OR WE COULD USE A COPY CONSTRUCTOR, by overloading
        Vroom car3 = new Vroom(car);

        //u.ps(car.make); will not work, protected!!!/private!!   GETTER REQUIRED!!
        u.ps(car.getmodel());
        u.ps(car.getyear());
        u.ps(car.getname());
        u.ps("");
        u.ps(car2.getname());
        u.ps("");
        u.ps(car3.getname());

        //car.year = 2022; WILL NOT WORK, PRIVATE!!! SETTER REQUIRED!!
        car.setyear(2023);
        u.ps(car.getyear());
    }
}

class Vroom{

    private String name;
    private String model;
    private int year;

    Vroom(String name, String model, int year){
        this.name = name;
        this.model = model;
        this.year = year;
        this.setmodel(model);
        this.setyear(year);
        this.setname(name);
    }
    Vroom(Vroom v){  //COPY CONSTRUCTOR!!! OVERLOADING
        this.name = v.name;
        this.model = v.model;
        this.year = v.year;
    }

    public int getyear(){   // THIS IS CALLED A GETTER, IT FETCHES THE PROTECTED/PRIVATE VALUES!! SECURITY!!
        return year; }
    public String getname(){ //SHOULD BE PUBLIC!!!
        return name; }
    public String getmodel(){
        return model; }
    public void setyear(int year){ //SETTERS!!
        this.year = year; }
    public void setname(String name){
        this.name = name; }
    public void setmodel(String model){
        this.model = model; }
    public void copy(Vroom v){  //COPYING OBJECT DATA!!! for eg- car2.copy(car); GIVES car VALUES TO car2.
        this.setyear(v.getyear());
        this.setmodel(v.getmodel());
        this.setname(v.getname()); }
}  // " copy constructor" , " getter method " , " setter method "
