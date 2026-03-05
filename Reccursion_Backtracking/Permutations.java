/*
Problem: Permutations (LeetCode 46)

Goal:
Generate all possible permutations of a given array of distinct integers.

Approach:
This problem is solved using Backtracking.

Idea:
At each position in the permutation, we can place any number that has not already been used.
To track which elements are already included in the current permutation, we use a boolean
array called "visited".

Steps:
1. Maintain a list "current" to store the current permutation being built.
2. Use a boolean array "visited" to track which elements are already used.
3. Iterate through all elements:
   - If an element has already been used, skip it.
   - Otherwise:
        a. Mark the element as visited.
        b. Add it to the current permutation.
        c. Recursively build the rest of the permutation.
        d. Backtrack by removing the element and marking it unused again.
4. When the size of "current" equals the size of the input array, a full permutation
   has been formed, so we add it to the result list.

Backtracking Pattern Used:
Choose → Explore → Undo

Example:
Input: nums = [1,2,3]

Output:
[
[1,2,3],
[1,3,2],
[2,1,3],
[2,3,1],
[3,1,2],
[3,2,1]
]

Time Complexity:
O(n! * n)
There are n! permutations and each permutation takes O(n) time to copy.

Space Complexity:
O(n) recursion depth + visited array (excluding result storage).
*/


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        
        BackTrack(nums,current,result,visited);
        return result;
    }
    private void BackTrack(int []nums,List<Integer> current,List<List<Integer>> result,boolean[] visited){
        if (current.size()==nums.length){
            result.add(new ArrayList<>(current));
        }
        for(int i=0;i<nums.length;i++){
            if (visited[i]) continue;
            visited[i]=true;
            current.add(nums[i]);
            BackTrack(nums,current,result,visited);
            current.remove(current.size()-1);
            visited[i]=false;
        }
    }
}

