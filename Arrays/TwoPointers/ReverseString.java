/*
LeetCode 344 - Reverse String
Difficulty: Easy
Pattern: Two Pointer Technique

Problem:
Given a character array, reverse the array in-place.

Approach:
- Use two pointers:
    left pointer starting from index 0
    right pointer starting from last index (length - 1)
- Swap characters at left and right
- Move pointers inward
- Continue until left < right

Time Complexity: O(n)
Space Complexity: O(1) (In-place modification)
*/

class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char swap= s[left];
            s[left]=s[right];
            s[right]=swap;
            left++;
            right--;
        }
    }
}
