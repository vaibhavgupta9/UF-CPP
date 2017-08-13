import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.ThreadLocalRandom;

/**
 * * The time complexity will not count the time of conversion between different graph representations
 * (e.g. from matrix to edges list or vertices list). Prim's algorithm implementation will take O(ELogE) or O(ELogV)
 * time complexity and O(V+E) space.
 */
public class PrimMST implements MST {

    private int[][] graphMatrix;
    private boolean[] visited;
    private PriorityQueue<UDiEdge> heap;
    private ArrayList<ArrayList<UDiEdge>> graphAdj;
    private int len;

    @Override
    public void init(int[][] graphMatrix) {
        // init the mini heap
        heap = new PriorityQueue<>(graphMatrix.length, Comparator.comparing(UDiEdge::getWeight));
        this.graphMatrix = graphMatrix;
        len = graphMatrix.length; // pre-calc the vertices number for convenience
        visited = new boolean[len]; // init the visited array
        graphAdj = this.getGraphByAdjacentList(graphMatrix); // init the adjacent edges for each vertex, implemented in MST interface
    }

    @Override
    public ArrayList<UDiEdge> getMST() {
        if (graphMatrix == null || len == 0) return null;

        return getMST(ThreadLocalRandom.current().nextInt(0, len));
    }

    public ArrayList<UDiEdge> getMST(int startNode) {
        ArrayList<UDiEdge> mst = new ArrayList<>();
        int current = startNode;
        while (mst.size() != len - 1) {
            visited[current] = true; // the current node has been marked as visited
            for (UDiEdge edge : graphAdj.get(current)) {
                if (active(edge)) // only the active edge will be added to the heap i.e. do not add duplicate edges
                    heap.offer(edge);
            }
            UDiEdge edge = heap.poll(); // pop the minimum edge from the heap
            while (!active(edge) && edge != null) {
                // if the edge is not active (both vertices of the edge has already been visited, do not count this edge,
                // pop the next edge until valid or the heap is empty
                edge = heap.poll();
            }

            current = getUnvisitedVertex(edge);
            if (current == -1 || edge == null) {
                // invalid situation, that means the graph has isolated vertex. MST does not exists should return null
                mst = null;
                break;

            }
            mst.add(edge);
        }

        return mst;
    }

    private boolean active(UDiEdge edge) {
        int v1 = edge.getV1();
        int v2 = edge.getV2();

        return !visited[v1] || !visited[v2];
    }

    private int getUnvisitedVertex(UDiEdge edge) {
        if (edge == null) return -1;

        int v1 = edge.getV1();
        int v2 = edge.getV2();

        if (visited[v1] && !visited[v2])
            return v2;
        else if (!visited[v1] && visited[v2])
            return v1;
        else
            return -1;
    }


}
