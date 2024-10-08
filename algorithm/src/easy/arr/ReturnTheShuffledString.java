package easy.arr;

import java.util.Arrays;

/**
 * You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 *
 * Return the shuffled string.
 *
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * Output: "leetcode"
 * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 *
 * @author Desperado
 */
public class ReturnTheShuffledString {
    
    public static void main(String[] args) {
        String s1 = "a";
        int[] indices1 = {0};
        
        char[] chars = s1.toCharArray();
        chars[0] = 'b';
        System.out.printf(new String(chars));
        
        String s2 = "abc";
        int[] indices2 = {1, 2, 0};
        
        String s3 = "codleeet";
        int[] indices3 = {4, 5, 6, 0, 7, 2, 1, 3};
        
//        System.out.println(restoreString(s1, indices1));
//        System.out.println(restoreString(s2, indices2));
//        System.out.println(restoreString(s3, indices3));
    }
    
    public static String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return String.valueOf(result);
    }
}
