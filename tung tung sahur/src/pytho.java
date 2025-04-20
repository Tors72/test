//handles execution of python scripts


import java.io.*;

public class pytho {
    static void start() throws IOException {
        ProcessBuilder a = new ProcessBuilder("py", "C:\\GitHub\\test\\tung tung sahur\\src\\script1.py");
        a.redirectErrorStream(true); //gives python output to java
        Process p = a.start(); //starts python process
        try (BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
            String line; //prints the output
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}