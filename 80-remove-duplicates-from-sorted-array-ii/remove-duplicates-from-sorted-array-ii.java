class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int k = 1;
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[k-1]) {
                nums[++k] = nums[i];
            } 
        }
        return k+1;

    }
}