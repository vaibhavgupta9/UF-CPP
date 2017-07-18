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
Using __weighted union find with path compression__ in the solution code in this repository, constructing the union sets time complexity will be ___O(V)___, the amortized _union_ and _find_ operation time complexity will almost be ___O(1)___.
The optimal solution can achieve ___O(N)___ time and ___O(N)___ space. Or another solution and achieve xxxxxxx.

## Notes
* The ___MST___ may not be
* xxxxxxx
* .....

Using xxx will result stack overflow. xxxxxxx

You can also add the guidance for how to use the test cases.
