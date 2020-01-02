package sort.select;

import org.junit.Assert;
import org.junit.Test;
import util.ArrayUtils;

import java.util.Random;

/**
 * <pre>
 * Test select sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestSelectSort {
    @Test
    public void testSelectSort1() {
        int[] array = new int[]{1};
        SelectSort.selectSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testSelectSort2() {
        int[] array = new int[]{2, 2};
        SelectSort.selectSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testSelectSort3() {
        int[] array = new int[]{1, 2};
        SelectSort.selectSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testSelectSort4() {
        int[] array = new int[]{2, 1};
        SelectSort.selectSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testSelectSortRandom() {
        int length = 100000;
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int r = 9000000 + random.nextInt() % 1000001;
            array[i] = r;
        }
        SelectSort.selectSort(array, length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, length);
        Assert.assertEquals(true, ordered);
    }
}
