[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

## Brief Intro
Tags:___Medium___, ___Graph___, ___BFS___, ___DFS___, __Union Find__


## Source
* from [leetcode q547](https://leetcode.com/problems/friend-circles/#/description)

## Complexity/Analysis
The optimal solution can achieve ___O(N*N)___ time and ___O(N)___ space.

## Notes
The problem is similar to finding number of connected components in a graph. It is an implementation of standard Union Find algorithm. The biggest misconcption is people confuse this problem with Standard BFS or DFS,but it's little different then it, though modified BFS or DFS will work for this problem. Following are some of the corner cases when you implement it using standard graph traversal algorithm or incorrect implementation of UF algorithm:
-   [[1,0,0,1],
    [0,1,1,0],
    [0,1,1,1],
    [1,0,1,1]]
- [[1,1,0,0,0,0,0,1,0,0,0,0,0,0,0],
[1,1,0,0,0,0,0,0,0,0,0,0,0,0,0],
[0,0,1,0,0,0,0,0,0,0,0,0,0,0,0],
[0,0,0,1,0,1,1,0,0,0,0,0,0,0,0],
[0,0,0,0,1,0,0,0,0,1,1,0,0,0,0],
[0,0,0,1,0,1,0,0,0,0,1,0,0,0,0],
[0,0,0,1,0,0,1,0,1,0,0,0,0,1,0],
[1,0,0,0,0,0,0,1,1,0,0,0,0,0,0],
[0,0,0,0,0,0,1,1,1,0,0,0,0,1,0],
[0,0,0,0,1,0,0,0,0,1,0,1,0,0,1],
[0,0,0,0,1,1,0,0,0,0,1,1,0,0,0],
[0,0,0,0,0,0,0,0,0,1,1,1,0,0,0],
[0,0,0,0,0,0,0,0,0,0,0,0,1,0,0],
[0,0,0,0,0,0,1,0,1,0,0,0,0,1,0],
[0,0,0,0,0,0,0,0,0,1,0,0,0,0,1]]

The above test cases are 2-D array which you need to supply as method parameter.