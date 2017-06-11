import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sol;

    @Before
    public void setUp() throws Exception {
        sol = new TwoPointerSolution();
    }

    @Test
    public void givenNormalArrayReturnSolutionSet() throws Exception {
        List<List<Integer>> actual = sol.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expected, actual);
    }

    @Test
    public void givenArrayContainsDupSolReturnSolutionSet() throws Exception {
        List<List<Integer>> actual = sol.threeSum(new int[]{-1,-1,-1, 0, 1, 2, -1, -4});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expected, actual);
    }
}
