
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        turnLeft();
        if (!frontIsClear() && !nextToABeeper()) {
            putBeeper();
            turnRight();
            if (frontIsClear()) {
                move();
            }
            else {
                turnRight();
                move();
                
            }
        }
        else {
            move();
            turnLeft();
            move();
        }
        if (nextToABeeper()) {
            turnOff();
        }
        plantBeepers();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

