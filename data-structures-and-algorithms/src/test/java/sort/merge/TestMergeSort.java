package sort.merge;

import org.junit.Assert;
import org.junit.Test;
import util.ArrayUtils;

import java.util.Random;

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
    public void testMergeSort1() {
        int[] array = new int[]{1};
        MergeSort.mergeSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testMergeSort2() {
        int[] array = new int[]{2, 2};
        MergeSort.mergeSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testMergeSort3() {
        int[] array = new int[]{1, 2};
        MergeSort.mergeSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testMergeSort4() {
        int[] array = new int[]{2, 1};
        MergeSort.mergeSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testMergeSortRandom() {
        int length = 1000000;
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int r = 9000000 + random.nextInt() % 1000001;
            array[i] = r;
        }
        MergeSort.mergeSort(array, length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, length);
        Assert.assertEquals(true, ordered);
    }
}
