import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

abstract public class MST {

    int[] parent, rank;
    int[][] gMatrix;
    PriorityQueue<UDiEdge> gHeap;
    int len;

    public abstract ArrayList<UDiEdge> getMST();

    public void init(int[][] graphMatrix) { // init all the data structures for UF
        this.gMatrix = graphMatrix;
        len = graphMatrix.length;
        parent = new int[len];
        rank = new int[len];
        for (int i = 0; i < len; i++) { // init for union find
            parent[i] = i;
            rank[i] = 1;
        }
    }

    PriorityQueue<UDiEdge> getGraphBySortedEdges(int[][] graphMatrix) {
        PriorityQueue<UDiEdge> graph = new PriorityQueue<>(graphMatrix.length, Comparator.comparing(UDiEdge::getWeight));
        for (int row = 0; row < graphMatrix.length; row++) {
            for (int col = row + 1; col < graphMatrix.length; col++) {
                if (graphMatrix[row][col] > 0)
                    graph.add(new UDiEdge(graphMatrix[row][col], row, col));
            }

        }

        return graph;
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

class UDiEdge { // Data structure to hold the edge
    final int weight;
    final int v1, v2;

    public UDiEdge(int weight, int v1, int v2) {
        this.weight = weight;
        this.v1 = v1;
        this.v2 = v2;
    }

    public int getWeight() {
        return weight;
    }

    public int getV1() {
        return v1;
    }

    public int getV2() {
        return v2;
    }

    // Override default equals for edge comparison(same edge)
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof UDiEdge)) return false;
        UDiEdge edge = (UDiEdge) obj;
        return ((v1 == edge.v1 && v2 == edge.v2) || (v1 == edge.v2 && v2 == edge.v1)) && edge.weight == weight;
    }
}
