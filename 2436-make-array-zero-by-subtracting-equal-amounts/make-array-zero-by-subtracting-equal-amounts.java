class Solution {
    public int minimumOperations(int[] nums) {
        // In every iternation, the smallest one will become zero. Hence, we need to find the unique positives only.
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                set.add(nums[i]);
            }
        }
        return set.size();       
    }
}