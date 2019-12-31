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
        for (int i = length; i > 1; i--) {
            // 提前退出冒泡排序循环标志
            boolean flag = false;
            for (int j = 0; j < i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            // 没有数据交换则退出循环
            if (!flag) {
                break;
            }
        }
    }
}
