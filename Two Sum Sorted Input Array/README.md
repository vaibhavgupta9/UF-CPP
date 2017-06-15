[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

## Brief Intro
Tags: ___easy___, ___Two Pointers___

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.
e.g.
```
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
```

## Source
brief intro to the source of this question. e.g.,
* from [leetcode q167](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted "Two Sum Sorted Input Array")

## Complexity/Analysis
Normal solution will achieve O(n) time and O(1) space. Optimal solution can achieve O(logN) time and O(1) space.

## Notes
The thought is using two pointers from beginning and end approaching the solution since the input array is sorted. The basic step by step two pointer solution will achieve O(n) time and O(1) space. Since the array is sorted, the actual optimal solution can achieve O(logN) time and O(1) space, but it's difficult to code during short interview time. 
