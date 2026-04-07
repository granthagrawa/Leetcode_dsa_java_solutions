/*This question have two ways in which it can be solved 
1st by using Arrays.sort 
2nd by using HashSet
HashSet is faster method bu uses memory where as sorting dont use memory*/  
  

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
