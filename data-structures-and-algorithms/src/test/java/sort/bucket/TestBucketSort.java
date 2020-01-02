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
    public void testBucketSort1() {
        int[] array = new int[]{1};
        BucketSort.bucketSort(array, array.length, 2);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testBucketSort2() {
        int[] array = new int[]{1, 2};
        BucketSort.bucketSort(array, array.length, 2);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testBucketSort3() {
        int[] array = new int[]{2, 1};
        BucketSort.bucketSort(array, array.length, 2);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testBucketSort4() {
        int[] array = new int[]{2, 2};
        BucketSort.bucketSort(array, array.length, 2);
        boolean ordered = ArrayUtils.isArrayOrderedInASC(array, array.length);
        Assert.assertEquals(true, ordered);
    }

    @Test
    public void testBucketSortInRandom() {
        int length = 1000000;
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
