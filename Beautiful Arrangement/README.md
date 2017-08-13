[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

# Beautiful Arrangement
Tags: ___Medium___, ___Backtracking___

Suppose you have __N__ integers from 1 to N. We define a beautiful arrangement as an array that is constructed by these N numbers successfully if one of the following is true for the ith position (1 ? i ? N) in this array:
1. The number at the ith position is divisible by i.
2. i is divisible by the number at the ith position.

Now given N, how many beautiful arrangements can you construct?

__Example 1:__
```
Input: 2
Output: 2
Explanation:

The first beautiful arrangement is [1, 2]:

Number at the 1st position (i=1) is 1, and 1 is divisible by i (i=1).

Number at the 2nd position (i=2) is 2, and 2 is divisible by i (i=2).

The second beautiful arrangement is [2, 1]:

Number at the 1st position (i=1) is 2, and 2 is divisible by i (i=1).

Number at the 2nd position (i=2) is 1, and i (i=2) is divisible by 1.
```

__Note:__
__N__ is a positive integer and will not exceed 15.


## Source
* from [leetcode q526](https://leetcode.com/problems/beautiful-arrangement)

## Complexity/Analysis
The optimal solution can achieve ___O(N)___ time and ___O(N)___ space. Or another solution and achieve xxxxxxx.

## Notes
The possible corner case includes
* xxxxxxx
* xxxxxxx
* .....

Using xxx will result stack overflow. xxxxxxx

You can also add the guidance for how to use the test cases.
