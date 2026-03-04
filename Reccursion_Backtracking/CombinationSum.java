/*
Problem: Combination Sum (LeetCode 39)

Goal:
Find all unique combinations of numbers from the given array that sum up to the target value.
Each number in the candidates array can be used unlimited times.

Approach:
This problem is solved using Backtracking.

Steps:
1. Start exploring combinations from index 0.
2. At each step, try adding a candidate number to the current combination.
3. Reduce the target by the chosen number.
4. Recursively continue building the combination.

Base Cases:
- If target becomes 0 → a valid combination is found, add it to the result.
- If target becomes negative → stop exploring that path.

Important Detail:
When making the recursive call we use the same index (BackTrack(i, ...)).
This allows the same element to be reused multiple times in the combination.

Backtracking Pattern:
1. Choose an element
2. Explore deeper using recursion
3. Undo the choice (remove the element)

This ensures all possible combinations are explored without affecting other branches.

Time Complexity:
Approximately O(2^n) in the worst case due to exploring multiple combinations.

Space Complexity:
O(n) recursion depth (excluding output storage).
*/


class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        BackTrack(0,candidates,current,result,target);
        return result;
    }
    private void BackTrack(int index,int[] candidates,List<Integer> current,List<List<Integer>> result,int target){
        
        if(target==0){
       result.add(new ArrayList<>(current)); 
       return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            current.add(candidates[i]);
            BackTrack(i,candidates,current,result,target- candidates[i]);
            current.remove(current.size()-1);

        }
    }
}

