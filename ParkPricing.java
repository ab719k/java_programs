/* 
################################################################
#                     Park Pricing Program                     #
################################################################

Theme Park pricing application. 
Write a program that prompts a user for their age. 
If they are age 3 or younger, their admission is free. 
If they are under age 10 but older than 3, they pay a $200 child admission. 
If they are over age 10, they pay $500 standard admission. 
If they are 65 or older, they pay $250 senior admission, 
and they are 100 or older, they get a free super senior admission.

Your program should function as follows:

Theme Park Prices!

How many people in your group: 4

1) Enter your age: 29
Standard admission of $500

2) Enter your age: 25
Standard admission of $500

3) Enter your age: 5
Child admission of $200

4) Enter your age: 3
Free admission!

Your Total cost to enter is $1200

How many people in your group:  2
1) Enter your age: 72
Senior admission of $250

2) Enter your age: 25
Standard admission of $500

Your Total cost to enter is $750

*/

import java.util.Scanner;

public class ParkPricing {

    static int AGE_LIMIT = 12;
    static int HEIGHT_LIMIT = 48;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Theme Park Prices!");        
        
        System.out.println("How many people in your group");
        int numInGroup = scanner.nextInt();

        // 


        // 


        // Close the Scanner
        scanner.close();
    }


}
