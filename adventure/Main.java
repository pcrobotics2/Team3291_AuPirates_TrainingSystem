package adventure;

import adventure.tools.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    /**
     * Main()
     *
     * This is the Main class constructor.   Place things in here that you want to be initialized
     * to when the program starts up.    In other classes, the constructor is used similarly, but
     * initialized when a new instance of the class is created.
     */
    public Main() {
        // Created because VSCode wanted an override.
    }

    /**
     * main()
     *
     * This is the first function that runs after the program is started.  Think of main() as
     * the starting place of any game you've ever played.   The story starts here.
     *
     * While the structure of this code isn't identical to robot code, the general principals of
     * how a program works is here.   Things you learn during these lessons will help you
     * understand how code our robot.
     *
     * @param args
     */
    public static void main(String... args) throws IOException {
        // Defined a 6-sided die and roll 1 time.
        var dice = new Dice(1, 6);
        String inputValue;
        var reader = new BufferedReader(new InputStreamReader(System.in));
        var rollValue = 0;
        var userGuess = 0;

        /**
         * Generally for robotics we won't use use System.out.println.   We should always try
         * to send information to SmartDashboard, Shuffleboard, or Glass.   Occasionally, we
         * use it though for quick debugging in the terminal output.
         */
        // Print out the die roll
        System.out.println("\n========================\n");

        /**
         * Again, we won't be taking inputs in this way for the robot.   We'll use SmartDashboard,
         * Shuffleboard, or Glass to take user inputs.   For intro stuff, it's a way to get user
         * input.
         */
        
         /**
         * Commenting out as it was an example.
        
        // Read user input from the terminal.
        System.out.print("Enter random string: ");
        inputValue = reader.readLine();

        System.out.println("You entered: " + inputValue);

        rollValue = dice.roll();
        System.out.println("You rolled a: " + rollValue);
        System.out.println("\n========================\n");
        
        */

        // TASK: Create a new 100-sided die that rolls 1 time.
        var hundredDie = new Dice(1, 100);

        // TASK: Roll the die and save result into a variable.
        int numberToGuess = hundredDie.roll();
        var successFlag = false;

        System.out.println("Guess the generated number between 1-100.");

        while (!successFlag) {
            // TASK: Create a prompt to guess what the die will roll.
            System.out.print("Enter your guess: ");
            userGuess = Integer.parseInt(reader.readLine());

            /**
             * TASK:
             * Check if guess matches number rolled.
             *
             * If match print "Yay! you chose correctly"
             *
             * If the guess doesn't match, the print "Try again"
             */
            if (numberToGuess == userGuess) {
                successFlag = true;

                break;
            } else if (numberToGuess > userGuess) {
                System.out.println("The number is greater than " + userGuess);
            } else {
                System.out.println("The number is less than " + userGuess);
            }
        }

        if (successFlag) {
            System.out.println("Yay! you chose correctly");
        } else {
            System.out.println("Please play again");
        }
    }
}
