import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by chris on 7/18/17.
 * The time complexity will not count the time of conversion between different graph representations
 * (e.g. from matrix to edges list or vertices list). Kruskal's algorithm implementation will take O(ELogE) to
 * sort all the edges, and the Union Find in this code implemented through weighted union find with paths
 * compression, which will take O(V) time to build the data structure and almost O(1) amortized time for
 * union and find operation. So the total time complexity is O(ELogE) and O(E+V) space complexity
 */
public class KruskalMST implements MST {

    private int[] parent, rank;
    private int[][] gMatrix;
    private Queue<UDiEdge> edges;
    private int len;

    @Override
    public void init(int[][] graphMatrix) {
        this.gMatrix = graphMatrix;
        len = graphMatrix.length;
        parent = new int[len];
        rank = new int[len];
        for (int i = 0; i < len; i++) { // init for union find
            parent[i] = i;
            rank[i] = 1;
        }
        edges = this.getGraphBySortedEdges(graphMatrix);
    }

    public ArrayList<UDiEdge> getMST() {
        int eCount = len - 1;
        ArrayList<UDiEdge> mst = new ArrayList<>();
        while (eCount > 0 && !edges.isEmpty()) {
            UDiEdge e = edges.poll();
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


    boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    int find(int p) {
        int root = p;
        while (root != parent[root])
            root = parent[root];
        while (p != root) { // path compression(flatten the tree)
            int newp = parent[p];
            parent[p] = root;
            p = newp;
        }
        return root;
    }

    void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;
        // union based on weight/rank
        if (rank[p] < rank[q]) {
            parent[rootP] = rootQ;
            rank[rootQ] += rank[rootP];
        } else {
            parent[rootQ] = rootP;
            rank[rootP] += rank[rootQ];
        }
    }
}
