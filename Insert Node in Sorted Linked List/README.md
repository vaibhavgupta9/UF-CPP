[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

## Brief Intro
Tags: ___Linkedlist___, ___easy___

Given a node from a cyclic linked list which has been sorted, write a function to insert a value into the list such that it remains a cyclic sorted list. The given node can be any single node in the list.

Notice: _3->5->1_ is a cyclic list, so 3 is next node of 1.  _3->5->1_ is the same with _5->1->3_
Example:
```
Given a list, and insert a value 4: 3->5->1       
return 5->1->3->4
```

## Source
brief intro to the source of this question. e.g.,
* from lintcode (paid question, so no link here)
* similar question on [GeeksforGeeks](http://www.geeksforgeeks.org/sorted-insert-for-circular-linked-list/) 

## Complexity/Analysis
The solution can achieve ___O(N)___ time and ___O(1)___ space.

## Notes
N/A