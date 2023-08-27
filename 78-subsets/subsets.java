class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        generateSubsets(0, new ArrayList<>(), allSubsets, nums);
        return allSubsets;
    }

    public void generateSubsets(int index, List<Integer> currentList, List<List<Integer>> allSubsets, int[] nums) {
        allSubsets.add(new ArrayList<>(currentList));
        for(int i = index; i < nums.length; i++) {
            currentList.add(nums[i]);
            generateSubsets(i + 1, currentList, allSubsets, nums);
            currentList.remove(currentList.size() - 1);
        }
    }
}