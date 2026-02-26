/*
LeetCode 27 - Remove Element
Difficulty: Easy
Pattern: Two Pointer (Array Filtering / Compaction)

Problem:
Given an array and a value val, remove all occurrences of val 
in-place and return the new length.

Approach:
1. Use two pointers:
   - slow → position to place valid elements.
   - fast → scans the array.
2. If nums[fast] != val,
   copy nums[fast] to nums[slow] and increment slow.
3. At the end, return slow (count of valid elements).

Time Complexity: O(n)
Space Complexity: O(1)

Key Concept:
In-place array compaction using boundary expansion.
*/


class Solution {
    public int removeElement(int[] nums, int val) {
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if (nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
