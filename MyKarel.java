import stanford.karel.*;

/*
 * MyKarel.java
 *
 * This is your robot. You are going to edit this file in class.
 *
 * Karel understands exactly four commands. That is not a simplification
 * to go easy on you; it is genuinely all there is:
 *
 *     move();          walk forward one square
 *     turnLeft();      rotate 90 degrees to the left
 *     pickBeeper();    pick up a beeper from the square you are standing on
 *     putBeeper();     put a beeper down on the square you are standing on
 *
 * The empty parentheses are required. move without them is not a command,
 * it is a typo, and the compiler will tell you so at length.
 *
 * There is no turnRight(). You will find that annoying for about ten seconds
 * and then you will work out what to do about it.
 */

public class MyKarel extends Karel {

    public void run() {

        // Right now Karel takes two steps and stops. Run it and watch.
       public void doubleTheBeepers(){
            putDoubleBeeperOnNextDoor();
            moveBeeperOnNextDoor();
                pickBeeper();
                move();
            }
       }
    }
        
        // YOUR TASK: get Karel to the beeper and pick it up.
        //
        // The beeper is two squares east and one square north of where Karel starts.
        //
        // Three more lines will do it. Add them below.

    

