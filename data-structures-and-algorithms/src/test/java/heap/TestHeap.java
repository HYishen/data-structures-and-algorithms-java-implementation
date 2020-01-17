package heap;

import org.junit.Assert;
import org.junit.Test;
import util.ArrayUtils;

import java.util.Random;

/**
 * <pre>
 * Test heap。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestHeap {
    @Test
    public void testHeapSort() {
        int count = 100001;
        int[] array = new int[count];
        Random random = new Random();
        for (int i = 1; i < count; i++) {
            array[i] = Math.abs(random.nextInt() % 100001);
        }
        Heap.heapSort(array, array.length);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, count);
        Assert.assertEquals(true, ordered);
    }
}
