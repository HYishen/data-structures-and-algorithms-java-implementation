package search.binary;

import org.junit.Assert;
import org.junit.Test;

/**
 * <pre>
 * Test first equals binary search。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestFirstEqualsBinarySearch {
    @Test
    public void testFirstEqualsBinarySearch() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.firstEqualsBinarySearch(array, array.length, 5);
        Assert.assertEquals(3, i);
    }

    @Test
    public void testFirstEqualsBinarySearch2() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.firstEqualsBinarySearch(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testFirstEqualsBinarySearch3() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.firstEqualsBinarySearch(array, array.length, 3);
        Assert.assertEquals(1, i);
    }

    @Test
    public void testFirstEqualsBinarySearch4() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.firstEqualsBinarySearch(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testFirstEqualsBinarySearch5() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.firstEqualsBinarySearch(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testFirstEqualsBinarySearch6() {
        int[] array = new int[]{1};
        int i = BinarySearch.firstEqualsBinarySearch(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testFirstEqualsBinarySearch7() {
        int[] array = new int[]{1};
        int i = BinarySearch.firstEqualsBinarySearch(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }

    // -------------------------------------------------------------------
    @Test
    public void testFirstEqualsBinarySearchS() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.firstEqualsBinarySearchS(array, array.length, 5);
        Assert.assertEquals(3, i);
    }

    @Test
    public void testFirstEqualsBinarySearchS2() {
        int[] array = new int[]{1, 3, 4, 5, 5, 5, 8, 9};
        int i = BinarySearch.firstEqualsBinarySearchS(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testFirstEqualsBinarySearchS3() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.firstEqualsBinarySearchS(array, array.length, 3);
        Assert.assertEquals(1, i);
    }

    @Test
    public void testFirstEqualsBinarySearchS4() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.firstEqualsBinarySearchS(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testFirstEqualsBinarySearchS5() {
        int[] array = new int[]{1, 3};
        int i = BinarySearch.firstEqualsBinarySearchS(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void testFirstEqualsBinarySearchS6() {
        int[] array = new int[]{1};
        int i = BinarySearch.firstEqualsBinarySearchS(array, array.length, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testFirstEqualsBinarySearchS7() {
        int[] array = new int[]{1};
        int i = BinarySearch.firstEqualsBinarySearchS(array, array.length, 0);
        Assert.assertEquals(-1, i);
    }
}
