import org.junit.Before;
import org.junit.Test;
import q08_01_TripleStep.DPIterSolution;
import q08_01_TripleStep.DPMemSolution;
import q08_01_TripleStep.Solution;

import static org.junit.Assert.assertEquals;

/**
 * Created by chris on 6/11/17.
 */
public class ChrisSolutionTest {

    Solution sol;

    @Before
    public void setUp() throws Exception {
//        sol = new ChrisDPMemSolution();
        sol = new ChrisDPIterSolution();
    }

    @Test
    public void givenZeroStepThenReturnZero() throws Exception {
        assertEquals(0, sol.countSteps(0));
    }

    @Test
    public void givenOneStepThenReturnOne() throws Exception {
        assertEquals(1, sol.countSteps(1));
    }

    @Test
    public void givenTwoStepsThenReturnTwo() throws Exception {
        // 1,1 -> 2 and 2 -> 2
        assertEquals(2, sol.countSteps(2));
    }

    @Test
    public void givenThreeStepsThenReturn() throws Exception {
        // 1,1,1 and 1,2 and 2,1 and 3

        assertEquals(4, sol.countSteps(3));
    }

    @Test
    public void givenThreePlusStepsThenReturnAppropriate() throws Exception {
        assertEquals(7, sol.countSteps(4));
        assertEquals(13, sol.countSteps(5));
    }
}