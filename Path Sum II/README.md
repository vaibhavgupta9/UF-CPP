[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

## Path Sum II
Tags: ___Medium___, ___Tree___, ___DFS___

Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and `sum = 22`,
```
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
```
return
```
[
   [5,4,11,2],
   [5,8,4,5]
]
```

## Source
* from [leetcode q113](https://leetcode.com/problems/path-sum-ii "Path Sum II")

## Complexity/Analysis
This problem can be solved with DFS solution. The recursive implementation looks very similar to backtracking solution.
The time complexity is __O(N)__ time and put __O(N)__ space (worst situation, tree is severely unbalanced) or __O(logN)__ space(best situation, tree is fully balanced) on the call stack.

## Note
* the tree node number can be either positive or negative

## Testing
To use the test case, you should include AssertJ 3.8+ and JUnit 4.12+.
