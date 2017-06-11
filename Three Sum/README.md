[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

## Brief Intro
Tags: ___medium___, ___Two Pointers___

Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

```
For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
```
## Source
brief intro to the source of this question. e.g.,
* from [leetcode q015](https://leetcode.com/problems/3sum "Three Sum")

## Complexity/Analysis
The optimal(maybe) solution can achieve ___O(N^2)___ time and ___O(1)___ space. Brutal force will take ___O(N^3)___ time.

## Notes
The idea for this question is to iterate each number, then do a two sum. The time complexity will be O(N^2). It may exists O(N logN) solution, but it's very difficult to code such a solution, must considering lots of corner cases. During interview, do not fall in the attempt to find a solution better than O(N^2). Using some container like Hashtable may increase the space complexity, and may not improve the time complexity.
* Duplicate solution is the key
