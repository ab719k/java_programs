public class ComplexNumberTest {
    public static void main(String[] args) {
        // Test the ComplexNumber class implementation

        // Test 1: Create complex numbers
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(-1, 2);

        // Test 2: Basic arithmetic operations
        ComplexNumber sum = num1.add(num2);
        System.out.println("Sum: " + sum); // Expected output: Sum: 1.0 + 5.0i

        ComplexNumber difference = num1.subtract(num2);
        System.out.println("Difference: " + difference); // Expected output: Difference: 3.0 + 1.0i

        ComplexNumber product = num1.multiply(num2);
        System.out.println("Product: " + product); // Expected output: Product: -8.0 + 4.0i

        ComplexNumber quotient = num1.divide(num2);
        System.out.println("Quotient: " + quotient); // Expected output: Quotient: 0.8 - 1.4i

        // Test 3: Absolute value and conjugate
        double absValue = num1.abs();
        System.out.println("Absolute Value of num1: " + absValue); // Expected output: Absolute Value of num1: 3.605551275463989

        ComplexNumber conjugate = num1.conjugate();
        System.out.println("Conjugate of num1: " + conjugate); // Expected output: Conjugate of num1: 2.0 - 3.0i

        // Test 4: Scalar operations
        int scalar = 5;
        ComplexNumber scaledSum = num1.add(scalar);
        System.out.println("Scaled Sum: " + scaledSum); // Expected output: Scaled Sum: 7.0 + 3.0i

        ComplexNumber scaledProduct = num1.multiply(scalar);
        System.out.println("Scaled Product: " + scaledProduct); // Expected output: Scaled Product: 10.0 + 15.0i
    }
}
