import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Definition in this Fib number starts from 1->0, 2->1, 3->1, 4->2 ...
 */
@RunWith(Parameterized.class)
public class SolutionTest {

    private Solution sol;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(5);

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 0}, {2, 1}, {3, 1}, {4, 2}, {5, 3}, {6, 5}, {7, 8},
                {10, 34}, {29, 317811}, {47, 1836311903}
        });
    }

    @Parameterized.Parameter // first data value (0) is default
    public /* NOT private */ int fInput;

    @Parameterized.Parameter(1)
    public /* NOT private */ int fExpected;


    @Before
    public void setUp() throws Exception {
//        sol = new ChrisTwoVariableSolution();
//        sol = new ChrisDPMemoSolution();
        sol = new NaiveDPRecursiveSolution();
    }


    @Test
    public void testFibonacci() throws Exception {
        assertEquals(fExpected, sol.fibonacci(fInput));
    }
}