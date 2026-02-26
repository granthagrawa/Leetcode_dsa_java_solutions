/*
LeetCode 80 - Remove Duplicates from Sorted Array II
Difficulty: Medium
Pattern: Two Pointer (Slow & Fast - Same Direction)

Problem:
Given a sorted array, remove duplicates in-place such that 
each element appears at most twice. Return the new length.

Approach:
1. Since the array is sorted, duplicates are grouped together.
2. We are allowed to keep at most 2 occurrences of each number.
3. Use two pointers:
   - slow → represents the length of the valid portion.
   - fast → scans the array.
4. Initialize slow = 2 (first two elements are always allowed).
5. For each element starting from index 2:
   - If nums[fast] != nums[slow - 2],
     it means we haven't exceeded the allowed limit.
   - Copy nums[fast] to nums[slow] and increment slow.
6. Return slow as the new valid length.

Time Complexity: O(n)
Space Complexity: O(1)

Key Concept:
Boundary control using slow pointer.
For allowing at most k duplicates:
- Initialize slow = k
- Compare with nums[slow - k]
*/


class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 2) {
            return nums.length;
        }

        int slow = 2;

        for (int fast = 2; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }
}

