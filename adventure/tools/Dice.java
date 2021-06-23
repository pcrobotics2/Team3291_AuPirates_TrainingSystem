package adventure.tools;

import java.util.Random;
/**
 * Dice
 * 
 * The purpose of this class is to handle any functionality related to 
 * rolling dice for the adventure.
 * 
 * NOTE: This really should be named Die because it's only dealing with
 * one die.
 * 
 * Lvl 1 - Lesson:
 * 
 * As you look through this class, you'll noticed a few things that may 
 * make you wonder.
 * 
 * 
 * 1) "public" and "private" - This will be covered later, but essentially is the
 * access level of the variable or function.   
 * 
 * "public" means that a function or variable is accessible outside of 
 * the class.   For example, the roll() function could be called
 * to roll the defined dice.
 * 
 * "private" means that a function or variable is only accessible from within
 * the class.   The only way to get the value of timesToRoll is by calling
 * getTimesToRoll() function.
 * 
 * 2) "this" - "this" means the object that's instantiated (created).   "this" will
 * allow you to access anything within the current class, public or private.
 */
public class Dice {
    // Number of times to roll the dice.
    private int timesToRoll = 1;

    // Number of sides the dice has.
    private int numberOfSides = 6;

    /**
     * Dice()
     * 
     * Empty constructor.  Every class should have at least an empty constructor.
     * In order to make an instance of a class, you need a constructor to help
     * instantiate a class.
     */
    public Dice() {
    }

    /**
     * Dice(timesToRoll, numberOfSides)
     * 
     * This constructor sets default values for the die
     * 
     * @param timesToRoll
     * @param numberOfSides
     */
    public Dice(int timesToRoll, int numberOfSides) {
        this.setTimesToRoll(timesToRoll);
        this.setNumberOfSides(numberOfSides);
    }

    /**
     * getTimesToRoll()
     * 
     * This retrieves the value of Dice's timesToRoll variable.
     */
    public int getTimesToRoll() {
        return this.timesToRoll;
    }

    /**
     * setTimesToRoll()
     * 
     * This sets the value of Dice's timesToRoll variable.
     * 
     * @param timesToRoll
     */
    public void setTimesToRoll(int timesToRoll) {
        this.timesToRoll = timesToRoll;
    }

    /**
     * getNumberOfSides()
     * 
     * This retrieves the value of Dice's numberOfSides variable.
     * @return
     */
    public int getNumberOfSides() {
        return this.numberOfSides;
    }

    /**
     * setNumberOfSides()
     * 
     * This sets the value of Dice's numberOfSides variable.
     * 
     * @param numberOfSides
     */
    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    /**
     * roll()
     * 
     * This returns the value of defined rolled die.
     * 
     * @return
     */
    public int roll() {
        int rolledValue = 0;
        int totalRolledValue = 0;
        int timesRolled;
        int max = this.numberOfSides;
        int min = 1;
        Random randomNumber = new Random();

        for (timesRolled = 0; timesRolled < this.timesToRoll; timesRolled++) {
            rolledValue = randomNumber.nextInt(max) + min;

            totalRolledValue += rolledValue;
        }

        return totalRolledValue;
    }
}
