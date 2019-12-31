package sort.bubble;

import org.junit.Assert;
import org.junit.Test;
import util.ArrayUtils;

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
    public void testBubbleSort() {
        int[] array = new int[]{4, 6, 5, 3, 2, 1, 8, 9, 7};
        BubbleSort.bubbleSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testBubbleSort2() {
        int[] array = new int[]{2, 1};
        BubbleSort.bubbleSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }
}
