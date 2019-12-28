package sort.merge;

import org.junit.Assert;
import org.junit.Test;

/**
 * <pre>
 * Test merge sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestMergeSort {
    @Test
    public void testMergeSort() {
        int[] array = new int[]{5, 1, 2, 8, 4, 9, 6, 3, 7};
        StringBuilder sb = new StringBuilder();
        MergeSort.mergeSort(array);
        for (int i : array) {
            sb.append(i);
        }
        Assert.assertEquals("123456789", sb.toString());
    }

    @Test
    public void testMergeSort2() {
        int[] array = new int[]{2, 1};
        StringBuilder sb = new StringBuilder();
        MergeSort.mergeSort(array);
        for (int i : array) {
            sb.append(i);
        }
        Assert.assertEquals("12", sb.toString());
    }
}
