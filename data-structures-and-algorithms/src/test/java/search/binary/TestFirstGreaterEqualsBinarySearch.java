package search.binary;

import org.junit.Assert;
import org.junit.Test;

/**
 * <pre>
 * Test first greater equals binary search。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestFirstGreaterEqualsBinarySearch {
    @Test
    public void testFirstGreaterEqualsBinarySearch() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.firstGreaterEqualsBinarySearch(array, array.length, 5);
        Assert.assertEquals(3, i);
    }

    @Test
    public void testFirstGreaterEqualsBinarySearch2() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.firstGreaterEqualsBinarySearch(array, array.length, 8);
        Assert.assertEquals(6, i);
    }

    @Test
    public void testFirstGreaterEqualsBinarySearch3() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.firstGreaterEqualsBinarySearch(array, array.length, 10);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testFirstGreaterEqualsBinarySearch4() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.firstGreaterEqualsBinarySearch(array, array.length, 3);
        Assert.assertEquals(1, i);
    }

    @Test
    public void testFirstGreaterEqualsBinarySearch5() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.firstGreaterEqualsBinarySearch(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testFirstGreaterEqualsBinarySearch6() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.firstGreaterEqualsBinarySearch(array, array.length, 10);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testFirstGreaterEqualsBinarySearch7() {
        int[] array = new int[]{1};
        int i = BinarySearch.firstGreaterEqualsBinarySearch(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testFirstGreaterEqualsBinarySearch8() {
        int[] array = new int[]{1};
        int i = BinarySearch.firstGreaterEqualsBinarySearch(array, array.length, 10);
        Assert.assertEquals(-1, i);
    }
}
