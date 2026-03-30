# 1. Two Sum (Easy)

### Problem Statement
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

<a href=https://leetcode.com/problems/two-sum/ target="_blank">Two Sum</a>

### Constraints
* `2 <= nums.length <= 10^4`
* `-10^9 <= nums[i] <= 10^9`

### My Logic
I used a Hash Map to store the value and its index. This allows me to find the complement in $O(1)$ time.
