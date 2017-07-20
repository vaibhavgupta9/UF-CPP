import java.util.ArrayList;

/**
 * Created by chris on 7/18/17.
 * The time complexity will not count the time of conversion between different graph representations
 * (e.g. from matrix to edges list or vertices list). Kruskal's algorithm implementation will take O(ELogE) to
 * sort all the edges, and the Union Find in this code implemented through weighted union find with paths
 * compression, which will take O(V) time to build the data structure and almost O(1) amortized time for
 * union and find operation. So the total time complexity is O(ELogE) and O(E+V) space complexity
 */
public class KruskalMST extends MST {

    @Override
    public void init(int[][] graphMatrix) {
        super.init(graphMatrix);
        this.gHeap = this.getGraphBySortedEdges(graphMatrix);
    }

    public ArrayList<UDiEdge> getMST() {
        int eCount = len - 1;
        ArrayList<UDiEdge> mst = new ArrayList<>();
        while (eCount > 0 && !gHeap.isEmpty()) {
            UDiEdge e = gHeap.poll();
            int v1 = e.getV1(), v2 = e.getV2();
            if (!connected(v1, v2)) {
                //no cycle, at least one of the vertices has not been included
                union(v1, v2);
                eCount--;
                mst.add(e);
            }
        }

        return mst;
    }
}
