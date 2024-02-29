/*
There is a toy (entirely for entertainment purposes) that purports to give you advice/answers to yes and no questions called the Magic 8 Ball. 
Shaking the ball causes a 20-sided number cube inside, suspended in a semi-viscous solution, to rotate. 
At some point, one of the sides will cling to a transparent window at the bottom of the toy. 
The result is a yes, no, or maybe answer.
Your objective for this programming assignment is to create a program that simulates the output of a Magic 8 Ball. 
Prompt the user for a yes/no question, then proceed to give them a random response that corresponds to a yes, no, or maybe. 
You do not need to code 20 different responses, maybe only do 4-8 in total.
But if you want here are those responses
    "Yes",
    "No",
    "Cannot predict now",
    "Ask again later",
    "Outlook not so good",
    "Reply hazy, try again",
    "My sources say no",
    "Signs point to yes",
    "Don't count on it",
    "Better not tell you now",
    "Concentrate and ask again",
    "Very doubtful",
    "It is certain",
    "It is decidedly so",
    "Most likely",
    "Without a doubt",
    "Yes, definitely",
    "You may rely on it",
    "As I see it, yes",
    "My reply is no"
A sample run of the program might look like this:
  
Magic 8 Ball!
Enter a yes/no question: Am I beautiful? 
Definitely not.
Magic 8 Ball!
Enter a yes/no question: Am I intelligent? 
Signs point to yes.
Magic 8 Ball!
Enter a yes/no question: Is there hope for humanity? 
Unclear at this time.


*/

import java.util.Scanner;

public class MagicBall {

   // Method to generate a random number between min (inclusive) and max (inclusive)
    public static int generateRandomNumber(int min, int max) {
        // Generating a random integer between min and max
        // Use Math.random() * (max - min + 1)) + min;
    }

    public static void main(String[] args) {
        // Array of possible responses
        String[] responses = {
            "Yes",
            "No",
            "Cannot predict now",
            "Ask again later",
            "Outlook not so good",
            "Reply hazy, try again",
            "My sources say no",
            "Signs point to yes",
            "Don't count on it",
            "Better not tell you now",
            "Concentrate and ask again",
            "Very doubtful",
            "It is certain",
            "It is decidedly so",
            "Most likely",
            "Without a doubt",
            "Yes, definitely",
            "You may rely on it",
            "As I see it, yes",
            "My reply is no"
        };

        // Creating a Random object

        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Hint: Create an infinite loop until user write quit or exit.
        {
            // Prompting the user for a question 
            //      Magic 8 Ball!
            //      Enter a yes/no question:       
            
            // Read User Input 

            // Generating a random index to select a response

            // Displaying the response
            
        }
        // Closing the scanner
        scanner.close();
    }
}
