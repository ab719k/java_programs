import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("Read from file: " + line);
            // Process the input as needed
        }

        scanner.close();
    }
}
