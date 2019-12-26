package sort.select;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <pre>
 * Test insert sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestSelectSort {

    @Test
    public void testSelectSort() {
        int[] array = new int[]{5, 1, 2, 8, 4, 9, 6, 3, 7};
        StringBuilder sb = new StringBuilder();
        SelectSort.selectSort(array);
        for (int i : array) {
            sb.append(i);
        }
        Assertions.assertEquals("123456789", sb.toString());
    }

    @Test
    public void testSelectSort2() {
        int[] array = new int[]{2, 1};
        StringBuilder sb = new StringBuilder();
        SelectSort.selectSort(array);
        for (int i : array) {
            sb.append(i);
        }
        Assertions.assertEquals("12", sb.toString());
    }
}
