package q198_HouseRobber;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chris on 6/11/17.
 */
public class SolutionTest {

    Solution sol;

    @Before
    public void setUp() throws Exception {
//        sol = new DPMemSolution();
        sol = new DPIterSolution();
    }

    @Test
    public void testEmptyInput() throws Exception {
        assertEquals(0, sol.rob(new int[]{}));
    }

    @Test
    public void testSingleInput() throws Exception {
        assertEquals(5, sol.rob(new int[]{5}));
    }

    @Test
    public void testNormalInput0() throws Exception {
        assertEquals(10, sol.rob(new int[]{5,10,4}));
    }

    @Test
    public void testNormalInputWithDupMax() throws Exception {
        assertEquals(10, sol.rob(new int[]{5,10,5}));
    }

    @Test
    public void testNormalInput1() throws Exception {
        assertEquals(13, sol.rob(new int[]{5,10,8}));
    }

    @Test
    public void testNormalInput2() throws Exception {
        assertEquals(18, sol.rob(new int[]{5,10,4,8}));
    }

    @Test
    public void testNormalInput3() throws Exception {
        assertEquals(4, sol.rob(new int[]{2,1,1,2}));
    }

    @Test
    public void testNormalInput4() throws Exception {
        assertEquals(4, sol.rob(new int[]{2,3,2}));
    }
}