/*
Problem: Permutations II (LeetCode 47)

Goal:
Generate all unique permutations of an array that may contain duplicate numbers.

Approach:
This problem is solved using Backtracking with a visited array.

Key Idea:
At each step we try to place an unused element into the current permutation.
A boolean array "visited" is used to track which elements are already included
in the current permutation.

Handling Duplicates:
Since the array may contain duplicate numbers, we sort the array first.
While iterating, we skip duplicates using the condition:

    if(i > 0 && nums[i] == nums[i-1] && !visited[i-1]) continue;

This ensures that duplicate numbers are used in order and prevents generating
duplicate permutation branches.

Backtracking Pattern:
1. Choose an element (add to current list)
2. Mark it as visited
3. Explore further using recursion
4. Undo the choice (remove element and mark as unvisited)

Example:
Input: nums = [1,1,2]

Output:
[
[1,1,2],
[1,2,1],
[2,1,1]
]

Time Complexity:
O(n! * n) in the worst case (n! permutations and O(n) to copy each).

Space Complexity:
O(n) recursion depth + visited array (excluding result storage).
*/


class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        Arrays.sort(nums);

        backtrack(nums,current,result,visited);
        return result;
    }
    private void backtrack(int[] nums,List<Integer> current, List<List<Integer>> result, boolean[] visited){
        if (current.size()==nums.length){
            result.add(new ArrayList<>(current));
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            if(i>0&&nums[i]==nums[i-1]&&!visited[i-1])continue;
            visited[i]=true;
            current.add(nums[i]);
            backtrack(nums,current,result,visited);
            current.remove(current.size()-1);
            visited[i]=false;
        }
    }
}

