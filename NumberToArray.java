import java.util.Scanner;

public class NumberToArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int inputNumber = scanner.nextInt();

        if (isValidNumber(inputNumber)) {
            int[] numberArray = convertToArray(inputNumber);
            System.out.println("The 4-digit number as an array:");
            for (int digit : numberArray) {
                System.out.print(digit + " ");
            }
        } else {
            System.out.println("Invalid input. Please enter a 4-digit number.");
        }

        scanner.close();
    }

    public static boolean isValidNumber(int number) {
        return number >= 1000 && number <= 9999;
    }

    public static int[] convertToArray(int number) {
        int[] numberArray = new int[4];
        for (int i = 3; i >= 0; i--) {
            numberArray[i] = number % 10;
            number /= 10;
        }
        return numberArray;
    }
}
