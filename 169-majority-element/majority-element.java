class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majority = 0;

        for (int i =0; i < nums.length; i++) {
            if(count == 0 && nums[i] != majority) {
                majority = nums[i];
                count +=1;
            } else if(nums[i] == majority) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}