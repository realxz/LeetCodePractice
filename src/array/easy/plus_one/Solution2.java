package array.easy.plus_one;

/**
 * realxz
 * <p>
 * 2019 - 07 -29
 * https://leetcode-cn.com/problems/plus-one/
 */
public class Solution2 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        int[] values = new int[digits.length + 1];
        values[0] = 1;
        return values;
    }
}
