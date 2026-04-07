import java.util.LinkedHashSet;

public class TrainConsistManagement{

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC5 - Train Formation (LinkedHashSet)");
        System.out.println("===================================");

        // Create LinkedHashSet to maintain order + uniqueness
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // ---- ADD BOGIES ----
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // ---- ADD DUPLICATE ----
        trainFormation.add("Sleeper"); // Duplicate (ignored)

        // ---- DISPLAY FINAL FORMATION ----
        System.out.println("\nFinal Train Formation:");

        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }

        System.out.println("\nProgram continues...");
    }
}