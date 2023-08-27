class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> allSubsetsWithoutDuplicates = new ArrayList<>();
        Arrays.sort(nums);
        generateSubsetsWithoutDuplicates(0, new ArrayList<>(), allSubsetsWithoutDuplicates, nums);
        return allSubsetsWithoutDuplicates;
    }

    public void generateSubsetsWithoutDuplicates(int index, List<Integer> currentList, List<List<Integer>> allSubsetsWithoutDuplicates, int[] nums) {
        allSubsetsWithoutDuplicates.add(new ArrayList<>(currentList));
        for(int i=index; i < nums.length; i++) {
            if(i > index && nums[i] == nums[i-1]) continue;
            currentList.add(nums[i]);
            generateSubsetsWithoutDuplicates(i + 1, currentList, allSubsetsWithoutDuplicates, nums);
            currentList.remove(currentList.size() - 1);
        }
    }
}