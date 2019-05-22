import java.lang.Math;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        final int SQ = 2;

        if (a.length == 0 || b.length == 0 || a == null || b == null) {
            return false;
        }// end if
        
        for (int curPosA : a) {
            double aSq = Math.pow(curPosA, SQ);

            for (int curPosB : b) {

                if (aSq == curPosB) {
                    return true;
                }// end if

            }// end for

        }// end for

        return false;
    }// end comp
}// end class


Tests

import static org.junit.Assert.*;
import org.junit.Test;


public class AreSameTest {

    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, AreSame.comp(a, b));
    }
}
