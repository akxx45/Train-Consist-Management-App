import java.util.LinkedList;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC4 - Ordered Train Consist");
        System.out.println("===================================");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // ---- ADD BOGIES ----
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // ---- INSERT Pantry Car at position 2 ----
        train.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry at position 2:");
        System.out.println(train);

        // ---- REMOVE FIRST AND LAST ----
        train.removeFirst();  // Removes Engine
        train.removeLast();   // Removes Guard

        System.out.println("\nAfter removing first and last bogies:");
        System.out.println(train);

        System.out.println("\nFinal ordered train consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }

        System.out.println("\nProgram continues...");
    }
}