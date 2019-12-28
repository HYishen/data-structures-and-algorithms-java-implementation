package list.link.single;


import org.junit.Assert;
import org.junit.Test;

/**
 * <pre>
 * Test Single Link List。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestSingleLinkList {
    @Test
    public void testSingleLinkListAdd() {
        SingleLinkList<String> sll = new SingleLinkList<>();
        sll.add("a");
        sll.add("b");
        sll.add("c");
        sll.add("d");
        Assert.assertEquals("[a,b,c,d]", sll.toString());
        Assert.assertEquals(4, sll.size());
        sll.remove("c");
        Assert.assertEquals("[a,b,d]", sll.toString());
        Assert.assertEquals(3, sll.size());
        sll.remove("d");
        Assert.assertEquals("[a,b]", sll.toString());
        Assert.assertEquals(2, sll.size());
        sll.add("e");
        Assert.assertEquals("[a,b,e]", sll.toString());
        Assert.assertEquals(3, sll.size());
        sll.remove("a");
        sll.remove("b");
        sll.remove("e");
        Assert.assertEquals("[]", sll.toString());
        Assert.assertEquals(0, sll.size());
        sll.add("a");
        sll.add("b");
        sll.add("c");
        Assert.assertEquals("[a,b,c]", sll.toString());
        Assert.assertEquals(3, sll.size());
        sll.remove("c");
        sll.remove("b");
        sll.remove("a");
        Assert.assertEquals("[]", sll.toString());
        Assert.assertEquals(0, sll.size());
    }

    @Test
    public void testSingleLinkListRemoveSingle() {
        SingleLinkList<String> sll = new SingleLinkList<>();
        sll.add("a");
        Assert.assertEquals("[a]", sll.toString());
        Assert.assertEquals(1, sll.size());
        sll.remove("a");
        Assert.assertEquals("[]", sll.toString());
        Assert.assertEquals(0, sll.size());
    }

    @Test
    public void testSingleLinkListRemoveEmpty() {
        SingleLinkList<String> sll = new SingleLinkList<>();
        sll.remove("a");
        Assert.assertEquals("[]", sll.toString());
        Assert.assertEquals(0, sll.size());
    }
}
