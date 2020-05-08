package easy.string;

/**
 * 14. 最长公共前缀 --解题失败
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * @author Pace2Car
 * @date 2019/8/23 16:55
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String[] strs = new String[]{"aflower","abflow","acflight"};
//        String[] strs = new String[]{"a"};
//        String[] strs = new String[]{"c", "c"};

        System.out.println(longestCommonPrefixAns(strs));
        System.out.println(longestCommonPrefix(strs));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    /**
     * 我的错误答案
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int commonLength = 0;
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < strs[0].length() && j < strs[i].length(); j++) {
                if (strs[i].charAt(j) != strs[0].charAt(j)) {
                    commonLength = j;
                } else if (strs[i].charAt(j) == strs[0].charAt(j)){
                    commonLength++;
                }
            }
        }
        return strs[0].substring(0,commonLength);
    }

    /**
     * 标准答案
     * @param strs
     * @return
     */
    public static String longestCommonPrefixAns(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
