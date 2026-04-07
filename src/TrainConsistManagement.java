import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC11 - Regex Validation");
        System.out.println("===================================");

        Scanner sc = new Scanner(System.in);

        // ---- USER INPUT ----
        System.out.print("\nEnter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // ---- DEFINE REGEX ----
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // ---- COMPILE PATTERNS ----
        Pattern pTrain = Pattern.compile(trainPattern);
        Pattern pCargo = Pattern.compile(cargoPattern);

        // ---- MATCH INPUT ----
        Matcher mTrain = pTrain.matcher(trainId);
        Matcher mCargo = pCargo.matcher(cargoCode);

        // ---- VALIDATION ----
        if (mTrain.matches()) {
            System.out.println("\nTrain ID is VALID");
        } else {
            System.out.println("\nTrain ID is INVALID");
        }

        if (mCargo.matches()) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        System.out.println("\nProgram continues...");
        sc.close();
    }
}