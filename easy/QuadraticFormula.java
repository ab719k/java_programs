import java.util.Scanner;

public class QuadraticFormula {

    public static void main(String[] args) {
        // TODO: Problem Statement
        // Write a Java program to solve a quadratic equation of the form: ax^2 + bx + c = 0
        // Instructions:
        // 1. Enter the values of coefficients a, b, and c of the quadratic equation.
        // 2. The program will calculate the roots of the equation using the quadratic formula.
        // 3. Display the roots of the equation.

        // TODO: User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficient 'a':");
        double a = scanner.nextDouble();

        System.out.println("Enter the coefficient 'b':");
        double b = scanner.nextDouble();

        System.out.println("Enter the coefficient 'c':");
        double c = scanner.nextDouble();

        // TODO: Calculate discriminant = b^2 -4ac
        // TODO: Check for real roots i.e. discrimant is greather than zero
        // Formulae for root(s) = (-b +/- Square Root of (b^2 - 4ac)) / (2 * a);
        // NOTE: What will change if discrimant is zero.
        // If no real roots are possible, print 'The equation has no real roots.' to output  

        scanner.close();
    }
}
