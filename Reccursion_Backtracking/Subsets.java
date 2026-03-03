/**
 * LeetCode 78 - Subsets
 *
 * Approach:
 * This problem is solved using Backtracking (Recursion).
 *
 * At each index, we have two choices:
 * 1. Include the current element in the subset.
 * 2. Exclude the current element from the subset.
 *
 * The recursion explores all possible combinations of these choices,
 * forming 2^n subsets.
 *
 * Base Case:
 * When index == nums.length, we add a copy of the current subset
 * to the result list.
 *
 * Important:
 * We use new ArrayList<>(current) to store a copy of the current subset,
 * otherwise all stored subsets would reference the same list.
 *
 * Time Complexity: O(n * 2^n)
 *  - There are 2^n subsets.
 *  - Copying each subset takes O(n).
 *
 * Space Complexity: O(n * 2^n)
 *  - For storing all subsets.
 *  - Recursion stack space is O(n).
 */



class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current= new ArrayList<>();
        
        backtrack(0,nums,current,result);

        return result;
    }

        private void backtrack(int index,int []nums,List<Integer> current,List<List<Integer>> result){
            if(index==nums.length){
                result.add(new ArrayList<>(current));
                return;
            }
            //take
            current.add(nums[index]);
            backtrack(index+1,nums,current,result);
            //not take
            current.remove(current.size()-1);
            backtrack(index+1,nums,current,result);
        }
}

