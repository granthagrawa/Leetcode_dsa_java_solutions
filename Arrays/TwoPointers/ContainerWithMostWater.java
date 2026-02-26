/*
LeetCode 11 - Container With Most Water
Difficulty: Medium
Pattern: Two Pointer (Opposite Direction / Greedy)

Problem:
Given an array height[], where each element represents the height
of a vertical line, find two lines that together with the x-axis
form a container such that the container holds the maximum water.

Approach:
1. Initialize two pointers:
   - left = 0
   - right = height.length - 1
2. At each step:
   - width = right - left
   - currentHeight = min(height[left], height[right])
   - area = width * currentHeight
   - Update maxArea if needed.
3. Move the pointer with the smaller height inward:
   - If height[left] < height[right] → left++
   - Else → right--
4. Continue until left < right.

Why Move the Smaller Height?
Because the area is limited by the smaller height.
Moving the taller height cannot increase area,
but moving the smaller height may find a taller boundary.

Time Complexity: O(n)
  Each element is visited at most once.

Space Complexity: O(1)
  Only pointers and variables are used.

Key Concept:
Greedy two-pointer approach using width shrink + height improvement logic.
*/


class Solution {
    public int maxArea(int[] height) {
        int maxA=0;
        int j=height.length-1;
        int i=0;
        while(i<j){
            int maxB=(Math.min(height[i],height[j]))*(j-i);
            if (height[i]<=height[j]) i++;
            else j--;
            if(maxB>maxA) maxA=maxB;
        }
        
        return maxA;
    }
}
