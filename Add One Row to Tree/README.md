[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

## Add One Row to Tree
Tags: ___Medium___, ___Tree___

Given the root of a binary tree, then value `v` and depth `d`, you need to add a row of nodes with value `v` at the given depth `d`. The root node is at depth 1.

The adding rule is: given a positive integer depth `d`, for each NOT null tree nodes `N` in depth `d-1`, create two tree nodes with value `v` as `N's` left subtree root and right subtree root. And `N's` __original left subtree__ should be the left subtree of the new left subtree root, its __original right subtree__ should be the right subtree of the new right subtree root. If depth `d` is 1 that means there is no depth d-1 at all, then create a tree node with value v as the new root of the whole original tree, and the original tree is the new root's left subtree.

__Example 1:__
```
Input:
A binary tree as following:
       4
     /   \
    2     6
   / \   /
  3   1 5   

v = 1

d = 2

Output:
       4
      / \
     1   1
    /     \
   2       6
  / \     /
 3   1   5   
```
__Example 2:__
```
Input:
A binary tree as following:
      4
     /   
    2    
   / \   
  3   1    

v = 1

d = 3

Output:
      4
     /   
    2
   / \    
  1   1
 /     \  
3       1
```
__Note:__  
1. The given d is in range [1, maximum depth of the given tree + 1].
2. The given binary tree has at least one tree node.

## Source
* from [leetcode q623](https://leetcode.com/problems/add-one-row-to-tree/#/description "Add One Row to Tree")

## Complexity/Analysis
The optimal solution can achieve ___O(N)___ time and ___O(N)___ space. Or another solution and achieve xxxxxxx.

## Notes
The possible corner case includes
* xxxxxxx
* xxxxxxx
* .....

Using xxx will result stack overflow. xxxxxxx

You can also add the guidance for how to use the test cases.
