// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.

public class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        result[i] = nums[i];
        i++;
        while (i < nums.length) {
            result[i] = result[i - 1] + nums[i];
            i++;
        }
        return result;
    }
}
