package easy.string;

/**
 * 28. 实现 strStr()
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * @author Pace2Car
 * @date 2019/8/26 17:02
 */
public class StrStr {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(strStrStupid("hello", "ll"));
        System.out.println(System.currentTimeMillis() - start + "ms");

        start = System.currentTimeMillis();
        System.out.println(strStrSmart("hello", "ll"));
        System.out.println(System.currentTimeMillis() - start + "ms");

        start = System.currentTimeMillis();
        System.out.println(strStrGenius("hello", "ll"));
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    /**
     * 我的愚蠢解法
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStrStupid(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if (len2 <= 0) return 0;
        for (int i = 0; i < len1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (len2 == 1) return i;
                for (int j = 1; j < len2; j++) {
                    if (len1 - i - len2 < 0) return -1;
                    if (haystack.charAt(i + j) != needle.charAt(j)) break;
                    if (haystack.charAt(i + j) == needle.charAt(j) && j == len2 - 1) return i;
                }
            }
        }
        return -1;
    }

    /**
     * 我的聪明解法
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStrSmart(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if (len2 <= 0) return 0;
        for (int i = 0; i < len1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (len2 == 1) return i;
                if (len1 - i - len2 < 0) return -1;
                if (haystack.substring(i, i + len2).equals(needle)) return i;
            }
        }
        return -1;
    }

    /**
     * 别人的聪明解法
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStrGenius(String haystack, String needle) {
        int hlen = haystack.length(), nlen = needle.length();
        if (hlen < nlen) return -1;
        int start = 0, end = nlen - 1;
        while (end < hlen) {
            if (haystack.substring(start++, ++end).equals(needle)) {
                return start - 1;
            }
        }
        return -1;
    }
}
