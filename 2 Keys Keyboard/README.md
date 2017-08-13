[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

# 2 Keys Keyboard
Tags: ___Medium___, ___Math___, ___DP___

Initially on a notepad only one character 'A' is present. You can perform two operations on this notepad for each step:
1. `Copy All`: You can copy all the characters present on the notepad (partial copy is not allowed).
1. `Paste`: You can paste the characters which are copied __last time__.

Given a number `n`. You have to get exactly `n` 'A' on the notepad by performing the minimum number of steps permitted. Output the minimum number of steps to get `n` 'A'.

__Example 1:__
```
Input: 3
Output: 3
Explanation:
Intitally, we have one character 'A'.
In step 1, we use Copy All operation.
In step 2, we use Paste operation to get 'AA'.
In step 3, we use Paste operation to get 'AAA'.
```

__Note:__

The n will be in the range [1, 1000].

## Source
* from [leetcode q650](https://leetcode.com/problems/2-keys-keyboard)

## Complexity/Analysis
For the linear solution, the worst case is the given number is a prime number, the case will take __O(N)__ time and __O(1)__ space to find the min steps.

//TODO, DP solution
