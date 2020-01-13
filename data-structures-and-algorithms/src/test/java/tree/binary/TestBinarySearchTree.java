package tree.binary;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Random;

/**
 * <pre>
 * Test binary search tree。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestBinarySearchTree {
    @Test
    public void testInsert() {
        BinarySearchTree bst = new BinarySearchTree();
        int count = 100000;
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            bst.insert(Math.abs(random.nextInt()) % 10001);
        }
        StringBuilder sb = new StringBuilder(bst.toString());
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String[] split = sb.toString().split(",");
        boolean flag = true;
        for (int i = 1; i < split.length; i++) {
            if (Integer.parseInt(split[i - 1]) > Integer.parseInt(split[i])) {
                flag = false;
            }
        }
        Assert.assertEquals(true, flag);
    }

    @Test
    public void testDelete() {
        BinarySearchTree bst = new BinarySearchTree();
        int deleteNumber = 1;
        int count = 100000;
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            bst.insert(Math.abs(random.nextInt()) % 10001);
        }
        StringBuilder sbbd = new StringBuilder(bst.toString());
        sbbd.deleteCharAt(0);
        sbbd.deleteCharAt(sbbd.length() - 1);
        String[] splitbd = sbbd.toString().split(",");
        int countDelete = 0;
        for (int i = 0; i < splitbd.length; i++) {
            if (Integer.parseInt(splitbd[i]) == deleteNumber) {
                countDelete++;
            }
        }

        bst.delete(deleteNumber);
        StringBuilder sb = new StringBuilder(bst.toString());
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String[] split = sb.toString().split(",");
        boolean flag = true;
        boolean deleteFlag = true;
        if (Integer.parseInt(split[0]) == deleteNumber) {
            deleteFlag = false;
        }
        for (int i = 1; i < split.length; i++) {
            if (Integer.parseInt(split[i - 1]) > Integer.parseInt(split[i])) {
                flag = false;
            }
            if (Integer.parseInt(split[i]) == deleteNumber) {
                deleteFlag = false;
            }
        }
        Assert.assertEquals(true, flag);
        Assert.assertEquals(true, deleteFlag);
        Assert.assertEquals(countDelete, count - split.length);
    }

    @Test
    public void testFind() {
        BinarySearchTree bst = new BinarySearchTree();
        int findNumber = 1;
        int count = 100000;
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            bst.insert(Math.abs(random.nextInt()) % 10001);
        }
        StringBuilder sb = new StringBuilder(bst.toString());
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String[] split = sb.toString().split(",");
        int countFind = 0;
        boolean flag = true;

        if (Integer.parseInt(split[0]) == findNumber) {
            countFind++;
        }
        for (int i = 1; i < split.length; i++) {
            if (Integer.parseInt(split[i]) == findNumber) {
                countFind++;
            }
            if (Integer.parseInt(split[i - 1]) > Integer.parseInt(split[i])) {
                flag = false;
            }
        }
        List<BinarySearchTree.Node> nodes = bst.find(findNumber);
        Assert.assertEquals(true, flag);
        Assert.assertEquals(countFind, nodes.size());
    }
}
