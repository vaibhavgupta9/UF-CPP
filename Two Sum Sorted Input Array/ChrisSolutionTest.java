import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ChrisSolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
//        solution = new TwoPointerSolution();
        solution = new TwoPointerBSSolution();
    }

    @Test
    public void givenInputArrayThenReturnCorrectIdx() throws Exception {
        assertArrayEquals(new int[]{1, 3}, solution.twoSum(new int[]{2, 3, 4}, 6));
    }

    @Test
    public void givenInputArrayThenReturnCorrectIdx1() throws Exception {
        assertArrayEquals(new int[]{2, 4}, solution.twoSum(new int[]{5, 6, 7, 10, 19}, 16));
    }

    @Test
    public void givenInputArrayThenReturnCorrectIdx2() throws Exception {
        assertArrayEquals(new int[]{4, 5}, solution.twoSum(new int[]{1, 2, 3, 5, 9, 17}, 14));
    }

    @Test
    public void givenInputArrayThenReturnCorrectIdx3() throws Exception {
        assertArrayEquals(new int[]{4, 5}, solution.twoSum(new int[]{1, 2, 4, 7, 8, 9, 10}, 15));
    }

    @Test
    public void givenInputArrayThenReturnCorrectIdx4() throws Exception {
        assertArrayEquals(new int[]{2, 3}, solution.twoSum(new int[]{1, 2, 4, 7, 8, 9, 10}, 6));
    }
}
