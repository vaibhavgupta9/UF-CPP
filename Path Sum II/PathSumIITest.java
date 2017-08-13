import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
/**
* requires assertj v3.x to run the Test
*/
public class PathSumIITest {
    @Test
    public void pathSum() throws Exception {
        PathSumII sol = new Chris_DFSRecursiveSolution();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.right = new TreeNode(2);
        root.left.left.left = new TreeNode(7);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        root.right.right.left = new TreeNode(5);

        Set<List<Integer>> expect = new HashSet<>();

        expect.add(new ArrayList<>(Arrays.asList(5, 4, 11, 2)));
        expect.add(new ArrayList<>(Arrays.asList(5, 8, 4, 5)));

        List<List<Integer>> result = sol.pathSum(root, 22);

        assertEquals(expect.size(), result.size());
        for (List<Integer> path : result) {
            assertThat(expect).contains(path);
        }
    }

}
