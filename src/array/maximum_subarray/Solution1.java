package array.maximum_subarray;

/**
 * realxz
 * <p>
 * 2019 - 07 -27
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
public class Solution1 {
    public int maxSubArray(int[] nums) {
        int max = 0;
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
