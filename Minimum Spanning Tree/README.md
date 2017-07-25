[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

## Minimum Spanning Tree
Tags: ___Tree___, ___Graph___, ___MST___

Given a connected and undirected graph, a ___spanning tree___ of that graph is a subgraph that is a tree and connects all the vertices together. A single graph can have many different spanning trees. A ___minimum spanning tree (MST)___ or minimum weight spanning tree for a weighted, connected and undirected graph is a spanning tree with weight less than or equal to the weight of every other spanning tree. The weight of a spanning tree is the sum of weights given to each edge of the spanning tree.

There are two commonly used algorithms to find ___MST___: _Kruskal_ and _Prim_.  

## Source
* from [geeksforgeeks Kruskal's MST Algorithm](http://www.geeksforgeeks.org/greedy-algorithms-set-2-kruskals-minimum-spanning-tree-mst/ "Kruskal's Algorithm")

## Kruskal's Minimum Spanning Tree Algorithm
### Algorithm
```
1. Sort all the edges in Increasing order of their weight.

2. Pick the smallest edge. Check if it forms a cycle with the spanning tree
formed so far (Using Uion Find to check the whether two vertices of the edge are in the same set). If cycle is not formed, include this edge. Else, discard it.  

3. Repeat step#2 until all V vertices have been in the same set (spanning tree).
```
### Pseudo code
```
Graph G has vertices Set V and Edge Set E
Sort E in increasing order by weight
foreach e in E // e can also be represented by (v1,v2)
  // starts from
  if find(v1) != find(v2)
    A = A plus {(v1,v2)}
    Union(v1, v2)
until all the vertices v in V are in A

return A
```
### Complexity/Analysis

The time complexity will not count the time of conversion between different graph representations (e.g. from matrix to edges list or vertices list). Kruskal's algorithm implementation will take __O(ELogE)__ to sort all the edges, and the Union Find in this code implemented through __weighted union find with path compression__, in which constructing the union sets time complexity will be __O(V)__, the amortized _union_ and _find_ operation time complexity will almost be __O(1)__. So the total time complexity is __O(ELogE)__ and __O(E)__ space complexity

## Prim's Minimum SPanning Tree Algorithm
Prim’s algorithm is to attach a new edge to a single growing tree at each step.
### Algorithm
 Start with any vertex as a single-vertex tree; then add V1 edges to it, always taking next the minimum weight edge that connects a vertex on the tree to a vertex not yet on the tree (a crossing edge for the cut defined by tree vertices). The implementation in this repository is lazy prim, which means the eligibility of edge will be validated when the edge has been popped. There is another eager Prim implementation, which will maintain a minimum edge to each vertex when adding to the heap. The latter implementation will have a better space complexity.

### Complexity/Analysis
The bottleneck in the algorithm is the number of edge-weight comparisons in the priority-queue(min-heap) methods insert() and delMin(). The number of edges on the priority queue is at most __E__, which gives the space bound. In the worst case, the cost of an insertion is ~__logE__ and the cost to delete the minimum is ~__2logE__. Since at most __E__ edges are inserted and at most __E__ are deleted, the time bound follows.

## Notes
* The ___MST___ by definition can contains either _zero_ or _negative_ weight edges. In this implementation, for simplicity we just use 0 weight to prepresent no connection between vertices.
