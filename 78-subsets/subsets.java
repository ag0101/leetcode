class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        generateSubsets(0, new ArrayList<>(), allSubsets, nums);
        return allSubsets;
    }

    public void generateSubsets(int index, List<Integer> currentList, List<List<Integer>> allSubsets, int[] nums) {
        if(index == nums.length) {
            allSubsets.add(new ArrayList<>(currentList));
            return;
        }
        currentList.add(nums[index]);
        generateSubsets(index + 1, currentList, allSubsets, nums);
        currentList.remove(currentList.size() - 1);
        generateSubsets(index + 1, currentList, allSubsets, nums);

    }
}