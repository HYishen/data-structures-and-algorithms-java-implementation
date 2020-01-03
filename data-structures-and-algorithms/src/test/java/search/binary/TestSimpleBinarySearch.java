package search.binary;

import org.junit.Assert;
import org.junit.Test;

/**
 * <pre>
 * Test simple binary search。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestSimpleBinarySearch {
    @Test
    public void testSimpleBinarySearch() {
        int[] array = new int[]{1, 3, 4, 6, 8, 9};
        int i = BinarySearch.simpleBinarySearch(array, array.length, 4);
        Assert.assertEquals(2, i);
    }

    @Test
    public void testSimpleBinarySearch2() {
        int[] array = new int[]{1, 3, 4, 6, 8, 9};
        int i = BinarySearch.simpleBinarySearch(array, array.length, 5);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testSimpleBinarySearch3() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.simpleBinarySearch(array, array.length, 3);
        Assert.assertEquals(1, i);
    }

    @Test
    public void testSimpleBinarySearch4() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.simpleBinarySearch(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testSimpleBinarySearch5() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.simpleBinarySearch(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testSimpleBinarySearch6() {
        int[] array = new int[]{1};
        int i = BinarySearch.simpleBinarySearch(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testSimpleBinarySearch7() {
        int[] array = new int[]{1};
        int i = BinarySearch.simpleBinarySearch(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }
}
