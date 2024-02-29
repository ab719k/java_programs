/* Write a java program that calculate the area of circle */

import java.util.Scanner;

public class CircleAreaCalculator {
    // Write a function to calculate the area of a circle
    // Start Code
    // Implement the function 'calculateArea' to calculate the area
    // Calculate the area of the circle using the formula: area = π * r^2
    // End code
  
    public static void main(String[] args) {
        double radius, area;

        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input        
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        // Implement a function to calculateArea over here

        System.out.printf("The area of the circle with radius %.2f is %.2f%n", radius, area);

        scanner.close();

    }        
}
