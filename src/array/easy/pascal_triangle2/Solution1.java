package array.easy.pascal_triangle2;

import java.util.ArrayList;
import java.util.List;

/**
 * realxz
 * <p>
 * 2019 - 07 -29
 * https://leetcode-cn.com/problems/pascals-triangle-ii/
 */
public class Solution1 {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> triangles = new ArrayList<>();

        if (numRows == 0) {
            List<Integer> triangle = new ArrayList<>();
            triangle.add(1);
            return triangle;
        }

        //First Row
        List<Integer> row = new ArrayList<>();
        //First Value
        row.add(1);
        triangles.add(row);

        for (int i = 1; i <= numRows; i++) {
            List<Integer> preRows = triangles.get(i - 1);
            List<Integer> currRows = new ArrayList<>();

            //First Value
            currRows.add(1);

            for (int j = 1; j < i; j++) {
                currRows.add(preRows.get(j - 1) + preRows.get(j));
            }

            //Last Value
            currRows.add(1);
            triangles.add(currRows);
        }

        return triangles.get(numRows);
    }
}
