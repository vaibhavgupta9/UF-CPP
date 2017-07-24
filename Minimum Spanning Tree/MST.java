import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public interface MST {

    ArrayList<UDiEdge> getMST();

    void init(int[][] graphMatrix); // init all the data structures for MST algorithm


    default PriorityQueue<UDiEdge> getGraphBySortedEdges(int[][] graphMatrix) {
        PriorityQueue<UDiEdge> graph = new PriorityQueue<>(graphMatrix.length, Comparator.comparing(UDiEdge::getWeight));
        for (int row = 0; row < graphMatrix.length; row++) {
            for (int col = row + 1; col < graphMatrix.length; col++) {
                if (graphMatrix[row][col] > 0)
                    graph.add(new UDiEdge(graphMatrix[row][col], row, col));
            }
        }
        return graph;
    }

    default ArrayList<ArrayList<UDiEdge>> getGraphByAdjacentList(int[][] graphMatrix) {
        ArrayList<ArrayList<UDiEdge>> graph = new ArrayList<>();
        for (int i = 0; i < graphMatrix.length; i++) {
            graph.add(new ArrayList<>());
        }

        for (int row = 0; row < graphMatrix.length; row++) {
            for (int col = row + 1; col < graphMatrix.length; col++) {
                if (graphMatrix[row][col] > 0) {
                    UDiEdge edge = new UDiEdge(graphMatrix[row][col], row, col);
                    graph.get(row).add(edge);
                    graph.get(col).add(edge);
                }
            }
        }
        return graph;
    }

}

class UDiEdge { // Data structure to hold the edge
    private final int weight;
    private final int v1, v2;

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
