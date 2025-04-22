
public class constructor {

    static void start() {

        // constructor = we are building (CONSTRUCTING) an object, with values which we are providing.
        // allows us to ***instantiate*** diff objects with diff attributes. this is why they are useful.

        Human human=new Human("Bob",14,90.0);
        u.ps(human.name);

        Human human2=new Human("Jeremiah",17,49.9);
        u.ps(human2.age);

        human.eat();
        human2.sleep();
    }
}

class Human {  //will use 'this' keyword in the same class.   THIS IS THE BLUEPRINT!!!!

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){  //this is a constructor. we give parameters
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    void eat(){
        u.ps(this.name+" is eating *nom*");
    }

    void sleep(){
        u.ps(this.name+" is sleeping *zz* ");
    }
}