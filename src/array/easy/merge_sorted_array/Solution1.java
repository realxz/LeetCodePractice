package array.easy.merge_sorted_array;

/**
 * realxz
 * <p>
 * 2019 - 07 -25
 * https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = (m + n) - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[p] = nums2[p2];
                p2--;
            } else {
                nums1[p] = nums1[p1];
                p1--;

            }
            p--;
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
