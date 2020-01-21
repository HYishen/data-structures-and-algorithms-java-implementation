package string;

import org.junit.Test;

/**
 * <pre>
 * Test BM（Boyer-Moore）算法。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestBMMatch {
    @Test
    public void testBMMatch() {
        String a = "abcacabcbcbacabcabacabc";
        String b = "abacabc";
        BMMatch bmMatch = new BMMatch();
        int i = bmMatch.bm(a.toCharArray(), a.length(), b.toCharArray(), b.length());
        System.out.println(i);
    }
}
