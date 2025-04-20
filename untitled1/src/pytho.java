//handles execution of python scripts
import java.io.IOException;

public class pytho {
    static void start() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("python", "script.py");
        Process p = pb.start();
        pb.redirectErrorStream(true);
    }
}

