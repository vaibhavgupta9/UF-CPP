import java.util.ArrayList;

/**
 * Created by chris on 7/18/17.
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
