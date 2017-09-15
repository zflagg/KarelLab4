 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        if (frontIsClear()) {
            turnLeft();
            if (!frontIsClear()) {
                turnRight();
                move();
            }
            else {
                if (!nextToABeeper()) {
                    putBeeper();
                    turnRight();
                    move();
                }
                else{
                    turnOff();
                }
            }
            closeAllWindows();
        }
        else {
            turnRight();
            closeAllWindows();
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

