import java.util.ArrayList;
import java.util.List;

// ---- Goods Bogie Class ----
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

// ---- Main Class ----
public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("===================================");

        // ---- CREATE LIST ----
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Open", "Grain"));

        // ❗ Try this to test failure:
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // ---- DISPLAY BOGIES ----
        System.out.println("\nGoods Bogies:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        // ---- SAFETY CHECK USING STREAM ----
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical")
                                || b.cargo.equalsIgnoreCase("Petroleum")
                );

        // ---- DISPLAY RESULT ----
        if (isSafe) {
            System.out.println("\nTrain is SAFE ✅");
        } else {
            System.out.println("\nTrain is UNSAFE ❌");
        }

        System.out.println("\nProgram continues...");
    }
}