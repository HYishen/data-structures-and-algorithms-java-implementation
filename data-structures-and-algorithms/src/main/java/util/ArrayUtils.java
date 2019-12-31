package util;

/**
 * <pre>
 * array utils。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class ArrayUtils {

    public static boolean isArrayOrderedInASC(int[] array, int length) {
        if (array == null || length <= 0) {
            return false;
        }
        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                flag = false;
            }
        }
        return flag;
    }
}
