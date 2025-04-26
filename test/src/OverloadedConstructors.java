/*
ERRORS TO IGNORE= Constructor 'Pizza(java.lang.String)' is never used
                  Constructor 'Pizza(java.lang.String, java.lang.String)' is never used
                  Constructor 'Pizza(java.lang.String)' is never used
 */


public class OverloadedConstructors { //overloaded constructors, multiple constructors in the same class
                        // same name but diff parameter.
    static void start(){ //similar to overloaded methods. DIFF PARAMETERS!!

        Pizza fazbear = new Pizza("Thick Crust","Pepperoni","Tomato","Mozzarella");

        u.ps("Was that the bite of 87?");
        u.ps(fazbear.bread);
        u.ps(fazbear.topping);
        u.ps(fazbear.cheese);
        u.ps(fazbear.sauce);
    }
}

class Pizza {
    String topping;
    String sauce;
    String bread;  //initialized outside constructor so that they can be used by other methods
    String cheese;

    Pizza(String bread, String topping, String sauce, String cheese) { //toppings

        this.bread = bread;
        this.topping = topping;
        this.sauce = sauce;
        this.cheese = cheese;

    }

    Pizza(String bread, String sauce, String cheese) {   //no toppings

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;

    }

    Pizza(String bread, String sauce) {  //vegan ahh pizza

        this.bread = bread;
        this.sauce = sauce;

    }

    Pizza(String bread) {

        this.bread = bread;

    }
}