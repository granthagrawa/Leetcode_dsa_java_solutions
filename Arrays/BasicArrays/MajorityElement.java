//also known as boyre moore

class Solution {
    public int majorityElement(int[] nums) {
        int rep=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(rep==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count<0){
                rep=nums[i];
                count=1;
            }
        }
        return rep;
    }
}
