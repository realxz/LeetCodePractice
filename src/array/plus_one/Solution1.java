package array.plus_one;

/**
 * realxz
 * <p>
 * 2019 - 07 -29
 * https://leetcode-cn.com/problems/plus-one/
 */
public class Solution1 {
    public int[] plusOne(int[] digits) {
        int position = -1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                position = i;
                break;
            }
        }

        if (position >= 0) {
            int[] values = new int[digits.length];
            System.arraycopy(digits, 0, values, 0, position + 1);
            return values;
        } else {
            int[] values = new int[digits.length + 1];
            values[0] = 1;
            return values;
        }
    }
}
