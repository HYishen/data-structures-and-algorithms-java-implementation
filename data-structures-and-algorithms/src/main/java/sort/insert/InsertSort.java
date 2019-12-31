package sort.insert;

/**
 * <pre>
 * insert sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class InsertSort {

    public static void insertSort(int[] array, int length) {
        if (array == null || length <= 1) {
            return;
        }
        for (int i = 1; i < length; i++) {
            int j = i - 1;
            int value = array[i];
            for (; j >= 0; j--) {
                if (array[j] > value) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
    }

}
