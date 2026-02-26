/*
LeetCode 167 - Two Sum II (Input Array Is Sorted)
Difficulty: Medium
Pattern: Two Pointer (Opposite Direction)

Problem:
Given a sorted array of integers, find two numbers such that 
they add up to a specific target number.
Return their 1-based indices.

Approach:
1. Since the array is sorted, use two pointers:
   - left starting from index 0
   - right starting from index n - 1
2. Calculate sum = numbers[left] + numbers[right].
3. If sum == target → return indices (left + 1, right + 1).
4. If sum < target → move left pointer forward (increase sum).
5. If sum > target → move right pointer backward (decrease sum).
6. Continue until solution is found.

Time Complexity: O(n)
  Each element is visited at most once.

Space Complexity: O(1)
  No extra data structures used.

Key Concept:
Directional pointer movement is possible because the array is sorted.
Moving left increases sum; moving right decreases sum.
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(numbers[i]+ numbers[j]!=target&&i<j){
        if(numbers[i]+ numbers[j]<target) i++;
        if(numbers[i]+ numbers[j]>target) j--;
        }
        return new int[]{i+1,j+1};
    }
    }
