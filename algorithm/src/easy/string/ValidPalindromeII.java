package easy.string;

/**
 * 680. 验证回文字符串 Ⅱ
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 *
 * 思路：双指针
 *
 * @author Pace2Car
 * @date 2020/5/9 16:30
 */
public class ValidPalindromeII {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String s = "abcdacba";
        System.out.println(validPalindrome(s));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static boolean validPalindrome(String s) {
        if (s == null) return false;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return validPalindrome(s, i + 1, j) || validPalindrome(s, i, j - 1);
            }
        }
        return true;
    }

    public static boolean validPalindrome(String s, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            if (s.charAt(startIndex) == s.charAt(endIndex)) {
                startIndex++;
                endIndex--;
            } else {
                return false;
            }
        }
        return true;
    }
}