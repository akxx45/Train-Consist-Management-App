import java.util.Arrays;

public class TrainConsistManagement {

    public static boolean binarySearch(String[] bogieIds, String key) {

        if (bogieIds.length == 0) {
            return false;
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
        System.out.println("UC19 - Binary Search Implementation");
        System.out.println("===================================");

        String[] bogieIds = {"BG309","BG101","BG550","BG205","BG412"};

        String searchKey = "BG205";

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }

        System.out.println("\nProgram continues...");
    }
}