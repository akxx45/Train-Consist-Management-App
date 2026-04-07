// ---- Main Class ----
public class TrainConsistManagement {

    // ---- Linear Search Method ----
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Found → stop early
            }
        }

        return false; // Not found
    }

    // ---- Main Method ----
    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC18 - Linear Search Implementation");
        System.out.println("===================================");

        // ---- ARRAY OF BOGIE IDs ----
        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        // ---- SEARCH KEY ----
        String searchKey = "BG309";

        System.out.println("Searching for: " + searchKey);

        // ---- SEARCH OPERATION ----
        boolean found = linearSearch(bogieIds, searchKey);

        // ---- RESULT ----
        if (found) {
            System.out.println("Bogie Found ✅");
        } else {
            System.out.println("Bogie Not Found ❌");
        }

        System.out.println("\nProgram continues...");
    }
}