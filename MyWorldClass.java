
import stanford.karel.*;

public class MyWorldClass extends Karel {

    private int collected = 0;

    public void run() {
        leaveBox();
        collectBeepers();
        returnHome();
        dropAllBeepers();
        turnLeft();         // face east again, like at the start
    }

    // Start (1,1) facing east: up the left column, across row 4,
    // then down column 4 and back west into row 3
    private void leaveBox() {
        turnLeft();
        moveTimes(3);       // up to (1,4)
        turnRight();
        moveTimes(3);       // east to (4,4)
        turnRight();
        move();             // down to (4,3)
        turnRight();
        move();             // west to (3,3)
    }

    private void collectBeepers() {
        pickAll();          // the 4 beepers at (3,3)
        move();             // (2,3)
        pickAll();
        turnAround();
        move();             // back to (3,3)
        turnRight();        // face south
        move();             // (3,2)
        pickAll();
        move();             // (3,1)
        pickAll();
    }

    // Retrace the route back out of the box to (1,1)
    private void returnHome() {
        turnAround();
        moveTimes(2);       // up to (3,3)
        turnRight();
        move();             // east to (4,3)
        turnLeft();
        move();             // up to (4,4)
        turnLeft();
        moveTimes(3);       // west to (1,4)
        turnLeft();
        moveTimes(3);       // down to (1,1)
    }

    private void dropAllBeepers() {
        for (int i = 0; i < collected; i++) {
            putBeeper();
        }
    }

    private void pickAll() {
        while (beepersPresent()) {
            pickBeeper();
            collected++;
        }
    }

    private void moveTimes(int n) {
        for (int i = 0; i < n; i++) {
            move();
        }
    }

    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    private void turnAround() {
        turnLeft();
        turnLeft();
    }
}