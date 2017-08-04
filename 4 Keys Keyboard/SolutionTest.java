import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sol;

    @Before
    public void setUp() throws Exception {
//        sol = new Chris_DPRecursiveSolution();
        sol = new Chris_DPIterativeSolution();
    }

    @Test
    public void givenBasicCasesThenNoPasteResult() throws Exception {

        assertEquals(1, sol.maxA(1));
        assertEquals(2, sol.maxA(2));
        assertEquals(3, sol.maxA(3));
        assertEquals(4, sol.maxA(4));
        assertEquals(5, sol.maxA(5));
        assertEquals(6, sol.maxA(6));
    }

    @Test
    public void givenValueHavingPasteResults() throws Exception {
        assertEquals(9, sol.maxA(7));
        assertEquals(12, sol.maxA(8));
        assertEquals(16, sol.maxA(9));
        assertEquals(20, sol.maxA(10));
        assertEquals(27, sol.maxA(11));
        assertEquals(36, sol.maxA(12));
        assertEquals(48, sol.maxA(13));
        assertEquals(64, sol.maxA(14));
        assertEquals(81, sol.maxA(15));
        assertEquals(108, sol.maxA(16));
        assertEquals(144, sol.maxA(17));
        assertEquals(192, sol.maxA(18));
        assertEquals(256, sol.maxA(19));
        assertEquals(324, sol.maxA(20));
        assertEquals(589824, sol.maxA(47));


    }

}