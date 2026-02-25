/*
LeetCode 125 - Valid Palindrome
Difficulty: Easy
Pattern: Two Pointer (Inward Traversal)

Problem:
Given a string, determine if it is a palindrome,
considering only alphanumeric characters and ignoring cases.

Approach:
1. Use two pointers:
   - left starting from index 0
   - right starting from index s.length() - 1
2. Skip non-alphanumeric characters using Character.isLetterOrDigit().
3. Convert characters to lowercase before comparison.
4. If characters mismatch → return false.
5. Continue until left < right.
6. If no mismatches found → return true.

Time Complexity: O(n)
  Each character is visited at most once.

Space Complexity: O(1)
  No extra data structures used (in-place comparison).

Key Concepts:
- Two Pointer Pattern
- Short-circuit evaluation (&&)
- Character handling in Java
- Edge case handling
*/

class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right&&!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while(left<right&&!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
