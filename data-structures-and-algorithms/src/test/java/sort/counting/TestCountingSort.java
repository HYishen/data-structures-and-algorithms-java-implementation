package sort.counting;

import org.junit.Assert;
import org.junit.Test;
import util.ArrayUtils;

import java.util.Random;

/**
 * <pre>
 * Test counting sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestCountingSort {
    @Test
    public void testCountingSort1() {
        int length = 1;
        int[] array = new int[]{1};
        CountingSort.countingSort(array, length, 1, 1);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testCountingSort2() {
        int length = 2;
        int[] array = new int[]{2, 2};
        CountingSort.countingSort(array, length, 2, 2);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testCountingSort3() {
        int length = 2;
        int[] array = new int[]{1, 2};
        CountingSort.countingSort(array, length, 2, 1);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testCountingSort4() {
        int length = 2;
        int[] array = new int[]{2, 1};
        CountingSort.countingSort(array, length, 2, 1);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testCountingSortRandom() {
        int length = 10000000;
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = Math.abs(random.nextInt()) % 701;
        }
        CountingSort.countingSort(array, length, 700, 0);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, length);
        Assert.assertEquals(true, ordered);
    }
}
