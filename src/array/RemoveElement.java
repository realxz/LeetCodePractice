package array;

/**
 * realxz
 * <p>
 * 2019 - 07 -23
 * https://leetcode-cn.com/problems/remove-element/
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
