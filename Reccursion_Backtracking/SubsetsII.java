/*
Problem: Subsets II (LeetCode 90)

Goal:
Generate all possible subsets of the given integer array, while avoiding duplicate subsets.

Approach:
This problem is solved using Backtracking.

Steps:
1. First sort the array so that duplicate elements appear next to each other.
2. Use recursion to explore all possible subsets.
3. At each recursion level:
   - Add the current subset to the result list.
   - Iterate through remaining elements using a for loop.
4. Skip duplicate elements using the condition:
      if(i > index && nums[i] == nums[i-1]) continue;
   This ensures that duplicate branches are not created at the same recursion level.
5. Use backtracking:
   - Choose an element (add it to the current list)
   - Explore further subsets recursively
   - Undo the choice (remove the element)

Key Concept:
Backtracking follows the pattern:
Choose → Explore → Undo

Time Complexity:
O(2^n) subsets are generated in the worst case.

Space Complexity:
O(n) recursion depth (excluding output storage).
*/



class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        Arrays.sort(nums);

        BackTrack(0,nums,current,result);

        return result;
    }

    private void BackTrack(int index,int[] nums,List<Integer> current,List<List<Integer>> result){
        result.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1]) continue;
        
        current.add(nums[i]);
        BackTrack(i+1,nums,current,result);
        current.remove(current.size()-1);
        }
    }
}

