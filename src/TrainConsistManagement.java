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

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

// ---- Main Class ----
public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC8 - Filter Bogies using Streams");
        System.out.println("===================================");

        // ---- CREATE LIST ----
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // ---- DISPLAY ORIGINAL LIST ----
        System.out.println("\nOriginal Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- FILTER USING STREAM ----
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // ---- DISPLAY FILTERED LIST ----
        System.out.println("\nFiltered Bogies (capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}