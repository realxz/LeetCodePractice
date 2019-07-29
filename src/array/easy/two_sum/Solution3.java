package array.easy.two_sum;

import java.util.HashMap;

public class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        int first = 0;
        int second = 0;
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numMap.containsKey(diff)) {
                first = i;
                second = numMap.get(diff);
                break;
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[]{first, second};
    }
}
