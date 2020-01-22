package string;

import org.junit.Test;

/**
 * <pre>
 * Test kmp算法。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestKMPMatch {
    @Test
    public void testBMMatch() {
        String a = "abcacabcbcbacabcabacabc";
        String b = "abacabc";
        KMPMatch kmpMatch = new KMPMatch();
        int i = kmpMatch.kmp(a.toCharArray(), a.length(), b.toCharArray(), b.length());
        System.out.println(i);
    }
}
