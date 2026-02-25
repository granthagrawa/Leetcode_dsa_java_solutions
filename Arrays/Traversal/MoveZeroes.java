/*
LeetCode 283 - Move Zeroes
Difficulty: Easy
Pattern: Two Pointer / Partition
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(nums[index]==0){
                nums[index]=nums[i];
                nums[i]=0;
                }
                index++;
            }
        }
    }
}
