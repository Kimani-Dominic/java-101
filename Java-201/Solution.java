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
