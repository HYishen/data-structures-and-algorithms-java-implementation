package sort.bubble;

import org.junit.Assert;
import org.junit.Test;
import util.ArrayUtils;

import java.util.Random;

/**
 * <pre>
 * Test bubble sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestBubbleSort {
    @Test
    public void testBubbleSort1() {
        int[] array = new int[]{1};
        BubbleSort.bubbleSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testBubbleSort2() {
        int[] array = new int[]{2, 2};
        BubbleSort.bubbleSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testBubbleSort3() {
        int[] array = new int[]{1, 2};
        BubbleSort.bubbleSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testBubbleSort4() {
        int[] array = new int[]{2, 1, 3, 6, 4};
        BubbleSort.bubbleSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        ArrayUtils.printArray(array);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testBubbleSortRandom() {
        int length = 100000;
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int r = 9000000 + random.nextInt() % 1000001;
            array[i] = r;
        }
        BubbleSort.bubbleSort(array, length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, length);
        Assert.assertEquals(true, ordered);
    }
}
