package easy.string;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 345. 反转字符串中的元音字母
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * @author Pace2Car
 * @date 2020/5/8 16:41
 */
public class ReversedVowel {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String s = "hello";
        System.out.println(reverseVowels(s));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    private final static HashSet<Character> VOWELS = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static String reverseVowels(String s) {
        if (s == null) return null;
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            if (!isVowel(chars[i])) {
                i++;
            } else if (!isVowel(chars[j])) {
                j--;
            } else {
                char temp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = temp;
            }
        }
        return new String(chars);
    }
}
