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
    public static void bucketSort(int[] array, int length, int separateCount) {
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
        bucketSortOperate(array, length, max, min, separateCount);
    }

    public static void bucketSortOperate(int[] array, int length, int max, int min, int separateCount) {
        List<Bucket> bucketList = new ArrayList<>(separateCount);
        int bucketRange = (max - min) / separateCount;
        int bucketSize = length / separateCount;
        int start = min;
        int end = min + bucketRange;
        while (start <= max && end <= max) {
            Bucket bucket = new Bucket(new int[bucketSize], 0, start, end);
            bucketList.add(bucket);
            start += bucketRange + 1;
            end += start + bucketRange;
        }
        for (int i = 0; i < length; i++) {
            bucketList.get(array[i] / separateCount).add(array[i]);
        }
        int index = 0;
        for (Bucket bucket : bucketList) {
            bucket.sort();
            int[] a = bucket.getArray();
            int size = bucket.getSize();
            for (int i = 0; i < size; i++) {
                array[index++] = a[i];
            }
        }
    }
}
