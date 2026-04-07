import java.util.ArrayList;
import java.util.List;

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
        System.out.println("UC10 - Total Seating Capacity");
        System.out.println("===================================");

        // ---- CREATE LIST ----
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 65));

        // ---- DISPLAY BOGIES ----
        System.out.println("\nBogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- CALCULATE TOTAL USING STREAM ----
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)       // Extract capacity
                .reduce(0, Integer::sum);  // Sum all values

        // ---- DISPLAY RESULT ----
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nProgram continues...");
    }
}