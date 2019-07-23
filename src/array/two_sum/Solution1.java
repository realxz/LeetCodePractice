package array.two_sum;

import sun.nio.ch.sctp.SendFailed;

/**
 * realxz
 * <p>
 * 2019 - 07 -23
 * https://leetcode-cn.com/problems/two-sum/
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int first = 0;
        int second = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    first = i;
                    second = j;
                    break;
                }
            }
        }
        return new int[]{first, second};
    }
}
