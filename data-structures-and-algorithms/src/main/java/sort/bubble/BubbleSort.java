package sort.bubble;

/**
 * <pre>
 * bubble sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class BubbleSort {
    public static void bubbleSort(int[] array, int length) {
        if (array == null || length <= 1) {
            return;
        }
        for (int i = length - 1; i > 0; i--) {
            boolean hasSwap = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    hasSwap = true;
                }
            }
            if (!hasSwap) {
                break;
            }
        }
    }
}
