import java.util.ArrayList;

class arraylists { //MORE ORGANISED!!
    static void start(){
        ArrayList<ArrayList<String>> grocerylist = new ArrayList<>(); //arraylist of arraylists.

        ArrayList<String> foodlist = new ArrayList<>();
        foodlist.add("Apple");
        foodlist.add("Banana");
        foodlist.add("Grape");
        grocerylist.add(foodlist);

        ArrayList<String> drinkslist = new ArrayList<>();
        drinkslist.add("soda");
        drinkslist.add("water");
        grocerylist.add(drinkslist);

        u.ps(drinkslist.getFirst());
        u.ps(String.valueOf(grocerylist.get(0))); // getFirst() == get(0)
        u.ps(grocerylist.get(0).get(1));
        //first get() retrieves the 0th ArrayList<String>
        // inside grocerylist which is,food list.
        // the second one finds the 1st element of it(index)


    }
}


