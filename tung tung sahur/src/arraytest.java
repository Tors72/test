import javax.swing.*;

public class arraytest {
    static void at() { // used to store multiple values in single variable
        String[] fruits = new String[3]; //assigning max index value for array. which is 3. (4 max string values)
        fruits[0] = JOptionPane.showInputDialog("First Fruit:");
        fruits[1] = JOptionPane.showInputDialog("Second Fruit:");
        fruits[2] = JOptionPane.showInputDialog("Third Fruit:");
        for (int i = 0; i < fruits.length; i++) {
            u.ps(fruits[i]);
        }
    }

    static void ar2d() { // array of arrays, multidimensional arrays
        String[][] colors = new String[2][2]; //THESE ARE INDEX VALUES!!! (0,1)
        // think of it as [rows][columns], [number of arrays][number of elements in each array]
        colors[0][0] = "Green";
        colors[0][1] = "Blue";
        colors[1][0] = "Red";
        colors[1][1] = "Yellow";
        //colors[2][0] = "White"; this would give out of bounds error
        u.ps(String.valueOf((colors.length))); //[number of arrays
        for (int i = 0; i < colors.length; i++) { //manages rows
            for (int j = 0; j < colors[i].length; j++) { //manages columns, takes length of row i
                System.out.print(colors[i][j]+" ");
            }
            u.ps("\n");
        }
    }
}



