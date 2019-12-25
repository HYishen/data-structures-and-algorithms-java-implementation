package list.link.single;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals("[a,b,c,d]", sll.toString());
        Assertions.assertEquals(4, sll.size());
        sll.remove("c");
        Assertions.assertEquals("[a,b,d]", sll.toString());
        Assertions.assertEquals(3, sll.size());
        sll.remove("d");
        Assertions.assertEquals("[a,b]", sll.toString());
        Assertions.assertEquals(2, sll.size());
        sll.add("e");
        Assertions.assertEquals("[a,b,e]", sll.toString());
        Assertions.assertEquals(3, sll.size());
        sll.remove("a");
        sll.remove("b");
        sll.remove("e");
        Assertions.assertEquals("[]", sll.toString());
        Assertions.assertEquals(0, sll.size());
        sll.add("a");
        sll.add("b");
        sll.add("c");
        Assertions.assertEquals("[a,b,c]", sll.toString());
        Assertions.assertEquals(3, sll.size());
        sll.remove("c");
        sll.remove("b");
        sll.remove("a");
        Assertions.assertEquals("[]", sll.toString());
        Assertions.assertEquals(0, sll.size());
    }

    @Test
    public void testSingleLinkListRemoveSingle() {
        SingleLinkList<String> sll = new SingleLinkList<>();
        sll.add("a");
        Assertions.assertEquals("[a]", sll.toString());
        Assertions.assertEquals(1, sll.size());
        sll.remove("a");
        Assertions.assertEquals("[]", sll.toString());
        Assertions.assertEquals(0, sll.size());
    }

    @Test
    public void testSingleLinkListRemoveEmpty() {
        SingleLinkList<String> sll = new SingleLinkList<>();
        sll.remove("a");
        Assertions.assertEquals("[]", sll.toString());
        Assertions.assertEquals(0, sll.size());
    }
}
