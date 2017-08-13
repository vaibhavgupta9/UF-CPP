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
 for Input A, B, C, D
 ```
 Base = A + B + C + D
 F(0) = 0*A + 1*B + 2*C + k*D
 F(1) = 1*A + 2*B + k*C + 0*D
  ...
 F(k) = F(k-1) + Base + (len-1)Array[k], 0<k<n, len is the max num of k, which is n
 ```
 The implementation uses __O(N)__ time to calc the base and use N iterations to calc all the __F(k)__, so time complexity is __O(N)__. Since it's an iterative implementation, the algorithm requires only constant space to store the intermediate results, so space complexity is __O(1)__
