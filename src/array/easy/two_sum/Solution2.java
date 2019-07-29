package array.easy.two_sum;

import java.util.HashMap;

/**
 * realxz
 * <p>
 * 2019 - 07 -23
 * https://leetcode-cn.com/problems/two-sum/
 */
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }

        int first = 0;
        int second = 0;
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numMap.containsKey(diff) && numMap.get(diff) != i) {
                first = i;
                second = numMap.get(diff);
            }
        }

        return new int[]{first, second};
    }

}
