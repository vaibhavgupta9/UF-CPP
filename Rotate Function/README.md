[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

## Rotate Function
Tags: ___Math___, ___Medium___

Given an array of integers `A` and let n to be its length.

Assume Bk to be an array obtained by rotating the array `A` _k_ positions clock-wise, we define a "rotation function" `F` on `A` as follow:
```
F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].
```
Calculate the maximum value of `F(0), F(1), ..., F(n-1)`.

__Note__:
_n_ is guaranteed to be less than 10^5.

__Example:__
```
A = [4, 3, 2, 6]

F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
```
So the maximum value of `F(0), F(1), F(2), F(3)` is `F(3) = 26`.

## Source
* from [leetcode q396](https://leetcode.com/problems/rotate-function "Rotate Function")

## Complexity/Analysis
The optimal solution can achieve ___O(N)___ time and ___O(N)___ space. Or another solution and achieve xxxxxxx.

## Notes
The possible corner case includes
* xxxxxxx
* xxxxxxx
* .....

Using xxx will result stack overflow. xxxxxxx

You can also add the guidance for how to use the test cases.
