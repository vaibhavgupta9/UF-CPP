import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void maxRotateFunction() throws Exception {
        Solution sol = new ChrisSolution();

        assertEquals(26, sol.maxRotateFunction(new int[]{4, 3, 2, 6}));
    }

}