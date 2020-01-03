package search.binary;

import org.junit.Assert;
import org.junit.Test;

/**
 * <pre>
 * Test last equals binary search。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestLastEqualsBinarySearch {
    @Test
    public void testLastEqualsBinarySearch() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.lastEqualsBinarySearch(array, array.length, 5);
        Assert.assertEquals(5, i);
    }

    @Test
    public void testLastEqualsBinarySearch2() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.lastEqualsBinarySearch(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testLastEqualsBinarySearch3() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.lastEqualsBinarySearch(array, array.length, 3);
        Assert.assertEquals(1, i);
    }

    @Test
    public void testLastEqualsBinarySearch4() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.lastEqualsBinarySearch(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testLastEqualsBinarySearch5() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.lastEqualsBinarySearch(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testLastEqualsBinarySearch6() {
        int[] array = new int[]{1};
        int i = BinarySearch.lastEqualsBinarySearch(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testLastEqualsBinarySearch7() {
        int[] array = new int[]{1};
        int i = BinarySearch.lastEqualsBinarySearch(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }

    // -------------------------------------------------------------------
    @Test
    public void testLastEqualsBinarySearchS() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.lastEqualsBinarySearchS(array, array.length, 5);
        Assert.assertEquals(5, i);
    }

    @Test
    public void testLastEqualsBinarySearchS2() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.lastEqualsBinarySearchS(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testLastEqualsBinarySearchS3() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.lastEqualsBinarySearchS(array, array.length, 3);
        Assert.assertEquals(1, i);
    }

    @Test
    public void testLastEqualsBinarySearchS4() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.lastEqualsBinarySearchS(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testLastEqualsBinarySearchS5() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.lastEqualsBinarySearchS(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testLastEqualsBinarySearchS6() {
        int[] array = new int[]{1};
        int i = BinarySearch.lastEqualsBinarySearchS(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testLastEqualsBinarySearchS7() {
        int[] array = new int[]{1};
        int i = BinarySearch.lastEqualsBinarySearchS(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }
}
