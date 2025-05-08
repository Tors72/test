//handles execution of python scripts


import java.io.*;

public class PyLoad {
    static void start() throws IOException {
        ProcessBuilder a = new ProcessBuilder("py", "C:\\GitHub\\test\\test\\src\\script1.py");
        a.redirectErrorStream(true); //gives python output to java
        Process p = a.start(); //starts python process
        try (BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}