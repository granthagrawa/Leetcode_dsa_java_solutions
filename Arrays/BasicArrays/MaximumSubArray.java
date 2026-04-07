//Also known as kadanes Algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        if ( nums.length == 1) return nums[0] ;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            
            maxSum=Math.max(currentSum,maxSum);
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}
