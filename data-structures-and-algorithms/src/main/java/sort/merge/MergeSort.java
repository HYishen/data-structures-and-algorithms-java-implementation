package sort.merge;

/**
 * <pre>
 * merge sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int[] tempArray = new int[array.length];
        mergeSortOperate(array, tempArray, 0, array.length - 1);
    }

    private static void mergeSortOperate(int[] array, int[] tempArray, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int middleIndex = (startIndex + endIndex) / 2;
        mergeSortOperate(array, tempArray, startIndex, middleIndex);
        mergeSortOperate(array, tempArray, middleIndex + 1, endIndex);
        merge(array, tempArray, startIndex, middleIndex, middleIndex + 1, endIndex);
    }

    private static void merge(int[] array, int[] tempArray, int leftArrayStartIndex, int leftArrayEndIndex, int rightArrayStartIndex, int rightArrayEndIndex) {
        int i = leftArrayStartIndex;
        int las = leftArrayStartIndex;
        int ras = rightArrayStartIndex;
        while (las <= leftArrayEndIndex && ras <= rightArrayEndIndex) {
            if (array[las] <= array[ras]) {
                tempArray[i++] = array[las++];
            } else {
                tempArray[i++] = array[ras++];
            }
        }

        int residueStartIndex = las;
        int residueEndIndex = leftArrayEndIndex;
        if (las > leftArrayEndIndex) {
            residueStartIndex = ras;
            residueEndIndex = rightArrayEndIndex;
        }
        while (residueStartIndex <= residueEndIndex) {
            tempArray[i++] = array[residueStartIndex++];
        }

        for (int j = leftArrayStartIndex; j <= rightArrayEndIndex; j++) {
            array[j] = tempArray[j];
        }
    }
}
