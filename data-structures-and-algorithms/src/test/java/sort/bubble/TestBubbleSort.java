package sort.bubble;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <pre>
 * Test bubble sort。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestBubbleSort {
    @Test
    public void testBubbleSort() {
        int[] array = new int[]{4, 6, 5, 3, 2, 1, 8, 9, 7};
        BubbleSort.bubbleSort(array);
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i);
        }
        Assertions.assertEquals("123456789", sb.toString());
    }

    @Test
    public void testBubbleSort2() {
        int[] array = new int[]{2, 1};
        StringBuilder sb = new StringBuilder();
        BubbleSort.bubbleSort(array);
        for (int i : array) {
            sb.append(i);
        }
        Assertions.assertEquals("12", sb.toString());
    }
}
