package sort.select;

/**
 * <pre>
 * select sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class SelectSort {

    public static void selectSort(int[] array, int length) {
        if (array == null || length <= 1) {
            return;
        }
        for (int i = 0; i < length; i++) {
            int value = array[i];
            int swapIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < value) {
                    value = array[j];
                    swapIndex = j;
                }
            }
            array[swapIndex] = array[i];
            array[i] = value;
        }
    }
}
