class Solution {
    public int[] runningSum(int[] nums) {
        int sumSoFar = 0;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            sumSoFar += nums[i];
            result[i] = sumSoFar;
        }
        return result;
    }
}