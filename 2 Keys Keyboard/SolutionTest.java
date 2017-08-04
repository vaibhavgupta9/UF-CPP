import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sol;

    @Before
    public void setUp() throws Exception {
        sol = new Chris_DirectLinearSolution();
    }

    @Test
    public void givenOneThenGotZero() throws Exception {
        assertEquals(0,sol.minSteps(1));
    }

    @Test
    public void givenBasicCases() throws Exception {
        assertEquals(3,sol.minSteps(3));
    }

    @Test
    public void givenDivisibleInputs() throws Exception {
        assertEquals(7,sol.minSteps(10));
        assertEquals(4,sol.minSteps(4));
        assertEquals(5,sol.minSteps(6));
    }

    @Test
    public void givenPrimeInputs() throws Exception {
        assertEquals(5,sol.minSteps(5));
    }

    @Test
    public void givenInputWithMultipleFactors() throws Exception {
        assertEquals(8,sol.minSteps(18));
    }
}