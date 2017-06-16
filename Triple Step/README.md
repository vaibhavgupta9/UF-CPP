[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

## Brief Intro
Tags: ___DP___, ___easy___.
A child is running up a staircase with n steps and can hop either 1step, 2 steps, or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.

## Source
* from CCI page 134. Solution/hints on page 342.

## Complexity/Analysis
the bottom-up solution will take ___O(n)___ time and ___O(1)___ space for each query. The mem(top-down) solution takes ___O(n)___ time for first several queries, but for queries in the range it takes ___O(1)___ time to access.

## Notes
This question is actually an upgraded version of Fibonacci number.
* Using brutal force/recursion will result stack overflow/timeout. Time complexity will be ___O(3^n)___.
* Memoization (top-down) solution can achieve ___O(n)___ space and ___O(n)___ time.
* bottom-up will achieve ___O(n)___ time and ___O(1)___ space
