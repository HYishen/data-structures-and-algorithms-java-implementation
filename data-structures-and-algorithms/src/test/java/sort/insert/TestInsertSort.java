package sort.insert;

import org.junit.Assert;
import org.junit.Test;

/**
 * <pre>
 * Test insert sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestInsertSort {

    @Test
    public void testInsertSort() {
        int[] array = new int[]{5, 1, 2, 8, 4, 9, 6, 3, 7};
        StringBuilder sb = new StringBuilder();
        InsertSort.insertSort(array);
        for (int i : array) {
            sb.append(i);
        }
        Assert.assertEquals("123456789", sb.toString());
    }

    @Test
    public void testInsertSort2() {
        int[] array = new int[]{2, 1};
        StringBuilder sb = new StringBuilder();
        InsertSort.insertSort(array);
        for (int i : array) {
            sb.append(i);
        }
        Assert.assertEquals("12", sb.toString());
    }
}
