import java.util.ArrayList;

public class foreachloops {
    static void start(){ //to iterate through all elements in an array/collection.
        String[] food= {"Apple","Banana","Orange","Borjir"};
        for(String i : food){   //imp**
        u.ps(i); } // i gets value of the element at i'th position. starts from 0th
        //works for arraylists too.


        u.ps("\n\n"); //for neatness


        //duplicated code from arraylists.java//
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

        for(ArrayList<String> i : grocerylist){
            for(String b : i){
                System.out.print(b+" ");
            }
            u.ps("");
        }
    }
}
