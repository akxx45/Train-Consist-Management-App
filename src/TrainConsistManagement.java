import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// ---- Bogie Class ----
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

// ---- Main Class ----
public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC13 - Loop vs Stream Performance");
        System.out.println("===================================");

        // ---- CREATE LARGE DATASET ----
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", 50 + (i % 50))); // varying capacity
        }

        // ================================
        // LOOP BASED FILTERING
        // ================================
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ================================
        // STREAM BASED FILTERING
        // ================================
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---- DISPLAY RESULTS ----
        System.out.println("\nLoop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("\nLoop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);

        // ---- VERIFY SAME RESULT ----
        if (loopResult.size() == streamResult.size()) {
            System.out.println("\nResults Match ✅");
        } else {
            System.out.println("\nResults Do NOT Match ❌");
        }

        System.out.println("\nProgram continues...");
    }
}