/*
 🌧️ Trapping Rain Water (LeetCode #42)

 Problem:
 Given an integer array height[] representing an elevation map,
 compute how much water can be trapped after raining.

 ------------------------------------------------------------

 🧠 Approach: Two Pointer Optimization (O(1) Space)

 Key Idea:
 Water trapped at index i depends on:
    water[i] = min(leftMax, rightMax) - height[i]

 Instead of using extra prefix and suffix arrays,
 we optimize using two pointers and dynamic boundary tracking.

 ------------------------------------------------------------

 ⏱ Time Complexity: O(n)
 📦 Space Complexity: O(1)

 ------------------------------------------------------------

 Key Concepts:
 - Two Pointer (Opposite Direction)
 - Greedy Boundary Decision
 - Dynamic Max Tracking
 - Space Optimization from O(n) to O(1)
*/


class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int LeftMax=0;
        int RightMax=0;
        int water=0;
        while(left<=right){
            if(height[left]<height[right]){
                if(height[left]>LeftMax){
                    LeftMax=height[left];
                }
                if(height[left]<=LeftMax){
                    water+=LeftMax-height[left];
                    left++;
                }
            }
            else{
                if(height[right]>RightMax){
                    RightMax=height[right];
                }
                if(height[right]<=RightMax){
                    water+=RightMax-height[right];
                    right--;
                }
            }
        }
        return water;
    }
}
