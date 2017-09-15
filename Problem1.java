
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        move();
        move();
        turnLeft();
        checkWall();
    }
    public void checkWall() {
        turnRight();
        if (frontIsClear()) {
            move();
        }
        else {
            turnLeft();
        }
        if (!frontIsClear()) {
            turnLeft();
        }
        else {
            move();
        }
        checkWall();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
}

