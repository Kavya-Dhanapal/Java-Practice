# 1200. Minimum Absolute Difference

[![LeetCode Link](https://img.shields.io/badge/LeetCode-Problem_Link-FFA116?style=flat-square&logo=leetcode)](https://leetcode.com/problems/minimum-absolute-difference/)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=flat-square)

## Problem Statement

Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows


	a, b are from arr
	a < b
	b - a equals to the minimum absolute difference of any two elements in arr


 
Example 1:

Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

Example 2:

Input: arr = [1,3,6,10,15]
Output: [[1,3]]


Example 3:

Input: arr = [3,8,-10,23,19,-4,-14,27]
Output: [[-14,-10],[19,23],[23,27]]


 
Constraints:


	2 <= arr.length <= 105
	-106 <= arr[i] <= 106

## Examples

```
Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

Input: arr = [1,3,6,10,15]
Output: [[1,3]]

Input: arr = [3,8,-10,23,19,-4,-14,27]
Output: [[-14,-10],[19,23],[23,27]]
```

## Constraints

- a, b are from arr
- a < b
- b - a equals to the minimum absolute difference of any two elements in arr

---
*Synced automatically with [AlgoVault](https://github.com/mr-sanjai-offl/AlgoVault)*