package easy.string;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * @author Pace2Car
 * @date 2019/8/27 17:37
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String str = "abcabcbbd";

        System.out.println(lengthOfLongestSubstring(str));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 1) return 0;
        int ans = 0;
        char[] chars = s.toCharArray();
        String temp = String.valueOf(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (temp.contains(String.valueOf(chars[i]))) {
                temp = temp.substring(temp.indexOf(chars[i]) + 1);
            }
            temp += chars[i];
            ans = Math.max(ans, temp.length());
        }
        return Math.max(ans, temp.length());
    }
}
