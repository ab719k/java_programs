// This program check if the attending guess can enter the amusement park based on heigh and age
// Second part of the program also tell if the person can attend the water park based on if the person can swim or not.
// input_amusement_park.txt file should contain four fields 'ageAsInt  heightAsInt canSwimAsBoolean hasLifeJacketAsBoolean'
// Run using java AmusementPark < input_amusement_park.txt
// 13 50 true true
// 8 45 false false
// 16 60 true false
// 10 55 true false
// 14 47 true true
// 9 42 false false
// 11 48 false true

import java.util.Scanner;

public class AmusementPark {

    static int AGE_LIMIT = 12;
    static int HEIGHT_LIMIT = 48;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read age and height from command line redirection
        int age = scanner.nextInt();
        int height = scanner.nextInt();

        // Part 1: Rollercoaster Ride
        System.out.println("Welcome to the Amusement Park!");

        boolean oldEnough = isOldEnough(age);
        boolean tallEnough = isTallEnough(height);

        boolean canRideRollercoaster = canRideRollercoaster(oldEnough, tallEnough);

        if (canRideRollercoaster) {
            System.out.println("You may ride the rollercoasters!");
        } else {
            System.out.println("Sorry, you may not ride the rollercoasters.");
        }

        // Part 2: Swimming Pool
        System.out.println("\nNow let's check the swimming pool.");

        // Read canSwim and hasLifeJacket from command line redirection
        boolean canSwim = scanner.nextBoolean();
        boolean hasLifeJacket = scanner.nextBoolean();

        boolean canSwimInPool = canSwimInPool(canSwim, hasLifeJacket);

        if (canSwimInPool) {
            System.out.println("You may swim in the pool!");
        } else {
            System.out.println("Sorry, you may not swim in the pool.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Function to check if a person is old enough
    private static boolean isOldEnough(int age) {
        return age >= AGE_LIMIT;
    }

    // Function to check if a person is tall enough
    private static boolean isTallEnough(int height) {
        return height >= HEIGHT_LIMIT;
    }

    // Function to check if a person can ride the rollercoaster
    private static boolean canRideRollercoaster(boolean oldEnough, boolean tallEnough) {
        return oldEnough && tallEnough;
    }

    // Function to check if a person can swim in the pool
    private static boolean canSwimInPool(boolean canSwim, boolean hasLifeJacket) {
        return canSwim || hasLifeJacket;
    }
}
