import java.util.Arrays;

// ---- Main Class ----
public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC17 - Arrays.sort() Implementation");
        System.out.println("===================================");

        // ---- INPUT ARRAY ----
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // ---- BEFORE SORT ----
        System.out.println("Before Sorting: " + Arrays.toString(bogieNames));

        // ---- SORTING USING BUILT-IN METHOD ----
        Arrays.sort(bogieNames);

        // ---- AFTER SORT ----
        System.out.println("After Sorting:  " + Arrays.toString(bogieNames));

        System.out.println("\nProgram continues...");
    }
}