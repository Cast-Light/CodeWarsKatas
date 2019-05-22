public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Variables
        final int EW = 2;
        final int HOME = 0;
        int walking = 0;

        // Calculate Walk
        if (walk.length == 10) {

            for (char dir : walk) {

                if (dir == 'n') {
                    walking++;
                } else if (dir == 's') {
                    walking--;
                } else if (dir == 'w') {
                    walking -= EW;
                } else if (dir == 'e') {
                    walking += EW;
                }

            }// end for

            if (walking == HOME) {
                return true;
            } else {
                return false;
            }// end if

        } else {
            return false;
        }// end if

    }// end isValid
}// end class


Tests
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TenMinWalkTest {
    @Test
    public void Test() {
        assertEquals("Should return true", true, TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }
}
