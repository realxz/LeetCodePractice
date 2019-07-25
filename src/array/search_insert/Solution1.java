package array.search_insert;

/**
 * realxz
 * <p>
 * 2019 - 07 -25
 * https://leetcode-cn.com/problems/search-insert-position/
 */
public class Solution1 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target || nums[i] == target) {
                return i;
            }
        }
        return nums.length;
    }
}
