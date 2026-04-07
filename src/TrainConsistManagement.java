// ---- Main Class ----
public class TrainConsistManagement {

    // ---- Bubble Sort Method ----
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Outer loop → number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop → comparison
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ---- Display Method ----
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // ---- Main Method ----
    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC16 - Bubble Sort Implementation");
        System.out.println("===================================");

        // ---- INPUT ARRAY ----
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Before Sorting: ");
        printArray(capacities);

        // ---- SORTING ----
        bubbleSort(capacities);

        System.out.print("After Sorting:  ");
        printArray(capacities);

        System.out.println("\nProgram continues...");
    }
}