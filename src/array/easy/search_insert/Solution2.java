package array.easy.search_insert;

/**
 * realxz
 * <p>
 * 2019 - 07 -25
 * https://leetcode-cn.com/problems/search-insert-position/
 */
public class Solution2 {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            // TODO: 2019/7/25 int mid = (low + high) >>> 1;
            int mid = (low + high) / 2;
            int midValue = nums[mid];
            if (midValue == target) {
                return mid;
            } else if (midValue > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
