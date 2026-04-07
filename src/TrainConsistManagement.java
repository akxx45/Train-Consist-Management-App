import java.util.Arrays;

public class TrainConsistManagement {

    public static boolean searchBogie(String[] bogieIds, String key) {

        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                return true;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC20 - Exception Handling in Search");
        System.out.println("===================================");

        String[] bogieIds = {"BG101","BG205","BG309"};

        String searchKey = "BG205";

        try {
            boolean found = searchBogie(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie Found");
            } else {
                System.out.println("Bogie Not Found");
            }

        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nProgram continues...");
    }
}