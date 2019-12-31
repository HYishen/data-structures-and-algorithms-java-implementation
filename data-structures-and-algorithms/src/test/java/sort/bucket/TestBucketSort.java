package sort.bucket;

import org.junit.Test;

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
    public void testBucket() {
        int[] array = new int[2];
        Bucket bucket = new Bucket(array, 0, 5, 10);
        bucket.add(3);
        bucket.add(1);
        bucket.add(2);
        bucket.add(4);
        bucket.add(5);
        int[] a = bucket.getArray();
        int size = bucket.getSize();
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        System.out.println("length: " + a.length);
    }
}
