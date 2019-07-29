package array.easy.remove_duplicates_from_sorted_array;

/**
 * realxz
 * <p>
 * 2019 - 07 -24
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 */
public class Solution1 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int position = 0;
        int compareValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != compareValue) {
                if (i != position + 1) {
                    nums[position + 1] = nums[i];
                }
                position++;
                compareValue = nums[i];
            }
        }
        return position + 1;

    }
}
