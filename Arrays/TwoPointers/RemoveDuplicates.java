/*
LeetCode 26 - Remove Duplicates from Sorted Array
Difficulty: Easy
Pattern: Two Pointer (Slow & Fast - Same Direction)

Problem:
Given a sorted array, remove the duplicates in-place such that 
each element appears only once and return the new length.

Approach:
1. Since the array is sorted, duplicates are adjacent.
2. Use two pointers:
   - slow → tracks the last unique element index.
   - fast → scans the array.
3. If nums[fast] != nums[slow], 
   move slow forward and copy nums[fast] to nums[slow].
4. At the end, return slow + 1 (length of unique portion).

Time Complexity: O(n)
Space Complexity: O(1)

Key Concept:
Maintain a boundary of unique elements on the left side.
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=0;
        for(int fast=1;fast<nums.length;fast++){
            if(nums[slow]!=nums[fast]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }
}

