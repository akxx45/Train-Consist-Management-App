import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC6 - Bogie Capacity Mapping");
        System.out.println("===================================");

        // Create HashMap (Bogie -> Capacity)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // ---- INSERT DATA ----
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // ---- DISPLAY DATA ----
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nProgram continues...");
    }
}