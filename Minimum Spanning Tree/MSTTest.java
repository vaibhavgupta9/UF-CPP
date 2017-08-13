import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MSTTest {

    MST sol;

    @Before
    public void setUp() throws Exception {
//        sol = new KruskalMST();
        sol = new PrimMST();
    }

    @Test
    public void givenGraphWithUniqueMST() throws Exception {
        int[][] input = new int[][]{
                {0, 3, 4, 0, 0}, //node 0
                {3, 0, 5, 6, 2}, //node 1
                {4, 5, 0, 0, 7}, //node 2
                {0, 6, 0, 0, 0}, //node 3
                {0, 2, 7, 0, 0}, //node 4
        };

        sol.init(input);
        List<UDiEdge> mst = sol.getMST();

        // MST total weight should be 15
        int mstWeight = mst.stream()
                .mapToInt(e -> e.getWeight())
                .sum();
        assertEquals(15, mstWeight);

        // MST contains edge 1-4:WT 2; 0-1:WT 3; 0-2:WT4; 1-3:WT6
        assertTrue(mst.contains(new UDiEdge(2, 1, 4)));
        assertTrue(mst.contains(new UDiEdge(3, 0, 1)));
        assertTrue(mst.contains(new UDiEdge(4, 0, 2)));
        assertTrue(mst.contains(new UDiEdge(6, 1, 3)));

        assertFalse(mst.contains(new UDiEdge(7, 2, 4)));
    }

    @Test
    public void givenGraphWithNonUniqueMST() throws Exception {
        int[][] input = new int[][]{
                {0, 3, 0, 3}, //node 0
                {3, 0, 2, 0}, //node 1
                {0, 2, 0, 1}, //node 2
                {3, 0, 1, 0}, //node 3
        };

        sol.init(input);
        List<UDiEdge> mst = sol.getMST();

        // MST total weight should be 6
        int mstWeight = mst.stream()
                .mapToInt(e -> e.getWeight())
                .sum();
        assertEquals(6, mstWeight);

        // MST contains edge 1-2:WT 2; 2-3:WT 1; then either 0-1:WT 3 or 0-3:WT 3;
        assertTrue(mst.contains(new UDiEdge(2, 1, 2)));
        assertTrue(mst.contains(new UDiEdge(1, 2, 3)));
        assertTrue(mst.contains(new UDiEdge(3, 0, 1))
                || mst.contains(new UDiEdge(3, 0, 3)));

    }
}
