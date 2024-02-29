import java.util.Scanner;

public class SelectionSortProgram {

    public static void main(String[] args) {
        // Step 1: Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Step 3: Create an array of the specified size
        int[] array = new int[size];

        // Step 4: Ask the user to enter elements for the array
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Step 5: Close the scanner to prevent resource leaks
        scanner.close();

        // Step 6: Display the original array
        System.out.println("Original Array: " + arrayToString(array));

        // TODO: Call the selectionSort function here

        // Step 7: Display the sorted array
        System.out.println("Sorted Array:   " + arrayToString(array));
    }

    // TODO: Implement the selectionSort function here
    // The function should take an array of integers as a parameter
    // It should sort the array in ascending order using the selection sort algorithm
    // Include comments in your code to explain each step of the selection sort algorithm

    // Helper function to convert an array to a string for display
    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
