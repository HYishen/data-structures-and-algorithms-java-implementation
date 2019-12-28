package sort.quick;

/**
 * <pre>
 * quick sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class QuickSort {
    public static void quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int separateIndex = partition(array, 0, array.length - 1);
        quickSortOperate(array, 0, separateIndex);
        quickSortOperate(array, separateIndex, array.length - 1);
    }

    public static void quickSortOperate(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int separateIndex = partition(array, startIndex, endIndex);
        quickSortOperate(array, startIndex, separateIndex);
        quickSortOperate(array, separateIndex + 1, endIndex);
    }

    public static int partition(int[] array, int startIndex, int endIndex) {
        // 消除数组为倒序时使排序时间复杂的变为O(n^2)的情况
        int middleIndex = (startIndex + endIndex) / 2;
        swap(array, middleIndex, endIndex);

        int pivot = array[endIndex];

        int i = startIndex;
        for (int j = startIndex; j < endIndex; j++) {
            if (array[j] <= pivot) {
                swap(array, i++, j);
            }
        }
        swap(array, i, endIndex);
        return i;
    }

    public static void swap(int[] array, int aIndex, int bIndex) {
        int temp = array[aIndex];
        array[aIndex] = array[bIndex];
        array[bIndex] = temp;
    }
}
