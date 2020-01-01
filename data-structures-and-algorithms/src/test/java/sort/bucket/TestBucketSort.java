package sort.bucket;

import org.junit.Assert;
import org.junit.Test;
import util.ArrayUtils;

import java.util.Random;

/**
 * <pre>
 * Test bucket sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestBucketSort {
    @Test
    public void testBucketSort() {
        int[] array = new int[]{5, 1, 2, 8, 4, 9, 6, 3, 7};
        BucketSort.bucketSort(array, array.length, 2);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testBucketSortInRandom() {
        int length = 100;
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int r = 90000 + random.nextInt() % 10001;
            array[i] = r;
        }
        BucketSort.bucketSort(array, length, 100);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, length);
        Assert.assertEquals(true, ordered);
    }
}
