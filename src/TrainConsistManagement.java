import java.util.*;
import java.util.stream.Collectors;

// ---- Bogie Class ----
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

// ---- Main Class ----
public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC9 - Group Bogies using Streams");
        System.out.println("===================================");

        // ---- CREATE LIST ----
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 65));

        // ---- DISPLAY ORIGINAL LIST ----
        System.out.println("\nOriginal Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- GROUP USING STREAM ----
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // ---- DISPLAY GROUPED RESULT ----
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        System.out.println("\nProgram continues...");
    }
}