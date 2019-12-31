package sort.merge;

import org.junit.Assert;
import org.junit.Test;
import util.ArrayUtils;

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
        MergeSort.mergeSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testMergeSort2() {
        int[] array = new int[]{2, 1};
        MergeSort.mergeSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }
}
