/* can be solved using 2 methods 
  easily solvable by Arrays.Sort but there is another method using the mathematical formula n*(n+1)/2
  making this with less time complexity*/

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedsum=(n*(n+1))/2;
        int actualsum=0;
        for(int num : nums){
            actualsum+=num;
        }
        return expectedsum - actualsum;
    }
}
