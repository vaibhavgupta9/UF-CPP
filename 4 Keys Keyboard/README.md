[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

# 4 Keys Keyboard
Tags: ___Medium___, ___Math___, ___Greedy___

Imagine you have a special keyboard with the following keys:

* `Key 1: (A)`: Prints one 'A' on screen.
* `Key 2: (Ctrl-A)`: Select the whole screen.
* `Key 3: (Ctrl-C)`: Copy selection to buffer.
* `Key 4: (Ctrl-V)`: Print buffer on screen appending it after what has already been printed.

Now, you can only press the keyboard for `N` times (with the above four keys), find out the maximum numbers of 'A' you can print on screen.

__Example 1:__
```
Input: N = 3
Output: 3
Explanation:
We can at most get 3 A's on screen by pressing following key sequence:
A, A, A
```
__Example 2:__
```
Input: N = 7
Output: 9
Explanation:
We can at most get 9 A's on screen by pressing following key sequence:
A, A, A, Ctrl A, Ctrl C, Ctrl V, Ctrl V
```
__Note:__
1. 1 <= N <= 50
2. Answers will be in the range of 32-bit signed integer.

## Source
* from [leetcode q651](https://leetcode.com/problems/4-keys-keyboard)

## Complexity/Analysis
The optimal solution can achieve ___O(N)___ time and ___O(N)___ space. Or another solution and achieve xxxxxxx.

## Notes
The possible corner case includes
* xxxxxxx
* xxxxxxx
* .....

Using xxx will result stack overflow. xxxxxxx

You can also add the guidance for how to use the test cases.
