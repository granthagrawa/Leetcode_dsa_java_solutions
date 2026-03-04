/*
Problem: Combination Sum II (LeetCode 40)

Goal:
Find all unique combinations in the array where the numbers sum to the target.
Each element can be used only once.

Approach:
Backtracking is used to explore all possible combinations.

Steps:
1. Sort the array to group duplicates together.
2. Iterate through candidates using a for loop.
3. Skip duplicates at the same recursion level.
4. Add the current element to the combination.
5. Recursively explore the next elements.
6. Backtrack by removing the last element.

Key Points:
- Use i+1 in recursion because each element can only be used once.
- Skip duplicates using:
      if(i > index && candidates[i] == candidates[i-1])

Time Complexity:
O(2^n) in the worst case.

Space Complexity:
O(n) recursion depth.
*/

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        Arrays.sort(candidates);
        BackTrack(0,candidates,current,result,target);

        return result;
    }
    private void BackTrack(int index,int [] candidates, List<Integer> current,List<List<Integer>> result,int target){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0) return;

        for(int i=index;i<candidates.length;i++){
            if(i>index&&candidates[i]==candidates[i-1]) continue;
            current.add(candidates[i]);

            BackTrack(i+1,candidates,current,result,target-candidates[i]);

            current.remove(current.size()-1);
        }
    }
}
