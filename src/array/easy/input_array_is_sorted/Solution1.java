package array.easy.input_array_is_sorted;

import java.util.HashMap;

/**
 * realxz
 * <p>
 * 2019 - 07 -29
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
 */
public class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = 0;
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            numberMap.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int value = target - numbers[i];
            if (numberMap.containsKey(value) && numberMap.get(value) != i) {
                index1 = i + 1;
                index2 = numberMap.get(value) + 1;
            }
        }

        return new int[]{Math.min(index1, index2), Math.max(index1, index2)};

    }
}
