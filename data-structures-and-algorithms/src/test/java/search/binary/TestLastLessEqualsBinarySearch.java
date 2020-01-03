package search.binary;

import org.junit.Assert;
import org.junit.Test;

/**
 * <pre>
 * Test last less equals binary search。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestLastLessEqualsBinarySearch {
    @Test
    public void testLastLessEqualsBinarySearch() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.lastLessEqualsBinarySearch(array, array.length, 5);
        Assert.assertEquals(5, i);
    }

    @Test
    public void testLastLessEqualsBinarySearch2() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.lastLessEqualsBinarySearch(array, array.length, 3);
        Assert.assertEquals(1, i);
    }

    @Test
    public void testLastLessEqualsBinarySearch3() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.lastLessEqualsBinarySearch(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testLastLessEqualsBinarySearch4() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.lastLessEqualsBinarySearch(array, array.length, 3);
        Assert.assertEquals(1, i);
    }

    @Test
    public void testLastLessEqualsBinarySearch5() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.lastLessEqualsBinarySearch(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testLastLessEqualsBinarySearch6() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.lastLessEqualsBinarySearch(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testLastLessEqualsBinarySearch7() {
        int[] array = new int[]{1};
        int i = BinarySearch.lastLessEqualsBinarySearch(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testLastLessEqualsBinarySearch8() {
        int[] array = new int[]{1};
        int i = BinarySearch.lastLessEqualsBinarySearch(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }
}
