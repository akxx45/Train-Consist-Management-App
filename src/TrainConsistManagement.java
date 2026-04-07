import java.util.ArrayList;
import java.util.List;

// ---- Custom Exception ----
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// ---- Passenger Bogie Class ----
class PassengerBogie {
    String type;
    int capacity;

    // Constructor with validation
    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " -> " + capacity;
    }
}

// ---- Main Class ----
public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC14 - Custom Exception Handling");
        System.out.println("===================================");

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // ---- VALID BOGIES ----
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 60));

            // ---- INVALID BOGIE (Test Case) ----
            bogies.add(new PassengerBogie("First Class", -10)); // ❌ will throw exception

        } catch (InvalidCapacityException e) {
            System.out.println("\nException Occurred: " + e.getMessage());
        }

        // ---- DISPLAY VALID BOGIES ----
        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}