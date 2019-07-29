package array.easy.remove_duplicates_from_sorted_array;


/**
 * realxz
 * <p>
 * 2019 - 07 -25
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * <p>
 * 在 {@link Solution1} 的基础上减少局部变量的创建
 */
public class Solution2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int position = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[position]) {
                if (i != position + 1) {
                    nums[position + 1] = nums[i];
                }
                position++;
                nums[position] = nums[i];
            }
        }
        return position + 1;

    }
}
