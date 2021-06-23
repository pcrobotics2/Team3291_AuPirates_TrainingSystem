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
        
        // Read user input from the terminal.
        System.out.print("Enter random string: ");
        inputValue = reader.readLine();

        System.out.println("You entered: " + inputValue);

        rollValue = dice.roll();
        System.out.println("You rolled a: " + rollValue);
        System.out.println("\n========================\n");
        

        // TASK: Create a new 100-sided die that rolls 1 time.

        // TASK: Roll the die and save result into a variable.

        // TASK: Create a prompt to guess what the die will roll.

        /**
         * TASK:
         * Check if guess matches number rolled.
         *
         * If match print "Yay! you chose correctly"
         *
         * If the guess doesn't match, the print "Try again"
         */
    }
}
