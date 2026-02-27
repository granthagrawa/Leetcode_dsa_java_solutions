/*
 🔢 3Sum (LeetCode #15)

 Problem:
 Given an integer array nums, return all unique triplets
 [nums[i], nums[j], nums[k]] such that:
        nums[i] + nums[j] + nums[k] == 0

 The solution set must not contain duplicate triplets.

 ------------------------------------------------------------

 💡 Why Sorting Is Important:

 - Enables two-pointer optimization.
 - Allows easy duplicate detection.
 - Reduces time complexity from O(n^3) to O(n^2).

 ------------------------------------------------------------

 ⏱ Time Complexity: O(n^2)
 📦 Space Complexity: O(1) (excluding output list)

 ------------------------------------------------------------

 Key Concepts:
 - Sorting
 - Two Pointer Technique
 - Duplicate Handling
 - Reducing 3Sum to 2Sum pattern
*/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length-2;i++){
            if (i>0&&nums[i]==nums[i-1]) continue;
            int left =i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if (sum<0){
                    left++;
                }
                else if (sum>0){
                    right--;
                }
                else{
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right&&nums[left]==nums[left-1]) left++;
                    while(left<right&&nums[right]==nums[right+1]) right--;
                }
            }
            
        }
        return result;
    }
}
