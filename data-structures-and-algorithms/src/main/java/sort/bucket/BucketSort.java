package sort.bucket;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * bucket sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class BucketSort {
    public static void bucketSort(int[] array, int length, int separateRange) {
        if (separateRange <= 0) {
            throw new RuntimeException("Please enter argument \"separateRange\" with positive integer.");
        }
        if (array == null || length <= 1) {
            return;
        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        bucketSortOperate(array, length, max, min, separateRange);
    }

    public static void bucketSortOperate(int[] array, int length, int max, int min, int separateRange) {
        int bucketCount = (max - min) / separateRange + 1;
        List<Bucket> bucketList = new ArrayList<>(bucketCount);
        int start = min;
        int end = min + separateRange;
        while (start <= max) {
            Bucket bucket = new Bucket(new int[length], 0, start, end);
            bucketList.add(bucket);
            start = end;
            end = start + separateRange;
        }
        for (int i = 0; i < length; i++) {
            bucketList.get((array[i] - min) / separateRange).add(array[i]);
        }
        for (Bucket bucket : bucketList) {
            bucket.sort();
        }
        int index = 0;
        for (Bucket bucket : bucketList) {
            int[] a = bucket.getArray();
            int size = bucket.getSize();
            for (int i = 0; i < size; i++) {
                array[index++] = a[i];
            }
        }
    }
}
