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
For each move number, we reserve at least three steps: select, copy, paste. And for the optimal result, we want to find somewhere P between [1,N], at optimal position P (after P steps), we select, copy, then paste, paste... until used up all steps. P must <= N-3 to guarantee there are 3 steps for the operation. Or the only possible operation is press 'A'. Suppose P is the optimal point to do the SCP (select, copy, paste), there are N-P steps remains. minus one step for select, one step for copy, the length of the string we can get after P, is N - P - 1 - 1 copies of the string at P steps. So the final length we can get is (N-P-1-1+1)*[string at P]. Starts from the N-3 step, we go way back to the first step, find the maximum length we can get. Both DP Recursive and Iterative solution will take O(N^2) time and O(N) space. There is also a reference webpage from [Geeks for Geeks](http://www.geeksforgeeks.org/how-to-print-maximum-number-of-a-using-given-four-keys/) explained the same idea. In the discussion board, someone mentioned in the iterative ways, there is no need to compare all the steps from i-3 to 1. (i>6) Through observation, the maximum step will always from i-4 step or i-5 step. So generally, the problem can be achieved in O(n), but the math proof is missing. Here is the link from [Leetcode Discussion](https://discuss.leetcode.com/topic/97631/two-java-dp-solution-o-n-2-and-o-n/2)
