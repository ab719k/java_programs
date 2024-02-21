import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        // Step 1: Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Step 3: Close the scanner to prevent resource leaks
        scanner.close();

        // Step 4: Call the convertFahrenheitToCelsius function and 
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        
        // Step 5: Display the result
        System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Celsius.%n", fahrenheit, celsius);
    }

    // TODO: Write a function named convertFahrenheitToCelsius
    // The function should take a Fahrenheit temperature as input and return the equivalent temperature in Celsius
    // Use the formula: Celsius = (Fahrenheit - 32) * 5 / 9

    // Hint: Use the method signature: private static double convertFahrenheitToCelsius(double fahrenheit)
}
