package easy.string;

/**
 * 58. 最后一个单词的长度
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 * @author Pace2Car
 * @date 2019/10/17 14:04
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String str = "b   a    ";
//        String str = "  ";

        System.out.println(lengthOfLastWordSmart(str));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static int lengthOfLastWord(String s) {
        s.trim();
        int len = 0, temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (' ' == s.charAt(i)) {
                if (temp > 0) {
                    len = temp;
                }
                temp = 0;
            } else {
                temp++;
            }
        }
        if (temp > 0) {
            return temp;
        }
        return len;
    }

    public static int lengthOfLastWordSmart(String s) {
        String[] arr = s.split("\\ ");
        if (arr.length == 0) return 0;
        return arr[arr.length-1].length();
    }
}
