package easy.math;

/**
 * 9.回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * @author chenjiahao
 * @date 2019/8/23 13:55
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println(isPalindromeMath(214101412));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static boolean isPalindromeMath(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int temp = x;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return reverse == x;
    }

    public static boolean isPalindromeString(int x) {
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        String s = String.valueOf(x);
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
