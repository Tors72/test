import javax.swing.*;
import java.io.File;

public class filehandling {
    static void run(){
        File file = new File("file.txt");
        if(file.exists()) {
            u.ps("File exists");
            u.ps(file.getAbsolutePath());
            u.ps(file.getPath());
            u.ps(file.isFile());
        }
        else System.out.println("File does not exist");
    }
}
