import java.util.Scanner;

public class OddNumberFinder {
  
    // TODO: Write a function to find and print odd numbers in the given range
    // The function should be named findAndPrintOddNumbers and should take two parameters (start and end)
    // It should print each odd number in the range on a new line
    // Hint: Use a for loop and check if each number is odd before printing 
  
    public static void main(String[] args) {
        // Step 1: Declare variables
        int start, end;

        // Step 2: Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Step 3: Prompt the user for input
        System.out.print("Enter the starting number of the range: ");
        start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        end = scanner.nextInt();

        // Step 4: Close the scanner to prevent resource leaks
        scanner.close();

        // Step 5: Find and print odd numbers in the given range
        System.out.println("Odd numbers in the range " + start + " to " + end + ":");
        findAndPrintOddNumbers(start, end);
    }

    
    
}
