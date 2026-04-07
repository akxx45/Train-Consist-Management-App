import java.util.*;

// ---- Custom Runtime Exception ----
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// ---- Goods Bogie Class ----
class GoodsBogie {
    String shape;   // Rectangular / Cylindrical
    String cargo;   // Petroleum / Coal / etc.

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    // ---- Cargo Assignment Method ----
    public void assignCargo(String cargoType) {
        try {
            // SAFETY RULE
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Petroleum cannot be assigned to Rectangular bogie"
                );
            }

            // SAFE ASSIGNMENT
            this.cargo = cargoType;
            System.out.println("Cargo assigned: " + cargoType + " → " + shape);

        } catch (CargoSafetyException e) {
            // HANDLE ERROR
            System.out.println("Exception: " + e.getMessage());

        } finally {
            // ALWAYS EXECUTES
            System.out.println("Assignment attempt completed.\n");
        }
    }

    @Override
    public String toString() {
        return shape + " -> " + (cargo == null ? "No Cargo" : cargo);
    }
}

// ---- Main Class ----
public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("===================================");

        // ---- CREATE BOGIES ----
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // ---- SAFE CASE ----
        b1.assignCargo("Petroleum"); // ✅ Allowed

        // ---- UNSAFE CASE ----
        b2.assignCargo("Petroleum"); // ❌ Exception

        // ---- CONTINUE PROGRAM ----
        b2.assignCargo("Coal"); // ✅ Safe

        // ---- DISPLAY FINAL STATE ----
        System.out.println("Final Bogie Status:");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\nProgram continues safely...");
    }
}