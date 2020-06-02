package easy.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 524. 通过删除字母匹配到字典里最长单词
 * 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，该字符串可以通过删除给定字符串的某些字符来得到。
 * 如果答案不止一个，返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。
 *
 * @author Pace2Car
 * @date 2020/5/13 14:03
 */
public class FindLongestWord {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String s = s = "abpcplea";
        List<String> d = new ArrayList<>(Arrays.asList("ale", "apple", "monkey", "plea", "bpplea", "applea"));
        System.out.println(findLongestWord(s, d));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for (String word : d) {
            int l1 = longestWord.length();
            int l2 = word.length();
            if (l1 < l2 || (l1 == l2 && longestWord.compareTo(word) > 0)) {
                if (isInDictionary(s, word)) {
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }

    public static boolean isInDictionary(String s, String word) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < word.length()) {
            if (s.charAt(i++) == word.charAt(j)) {
                j++;
            }
        }

        return j == word.length();
    }
}