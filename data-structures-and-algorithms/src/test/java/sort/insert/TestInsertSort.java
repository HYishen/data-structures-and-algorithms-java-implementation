package sort.insert;

import org.junit.Assert;
import org.junit.Test;
import util.ArrayUtils;

import java.util.Random;

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
    public void testInsertSort1() {
        int[] array = new int[]{1};
        InsertSort.insertSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testInsertSort2() {
        int[] array = new int[]{2, 2};
        InsertSort.insertSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testInsertSort3() {
        int[] array = new int[]{1, 2};
        InsertSort.insertSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testInsertSort4() {
        int[] array = new int[]{2, 1};
        InsertSort.insertSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testInsertSortRandom() {
        int length = 100000;
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int r = 9000000 + random.nextInt() % 1000001;
            array[i] = r;
        }
        InsertSort.insertSort(array, length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, length);
        Assert.assertEquals(true, ordered);
    }
}
