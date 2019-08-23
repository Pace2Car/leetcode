package easy.math;

/**
 * 7.整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @author chenjiahao
 * @date 2019/8/23 14:36
 */
public class IntegerReverse {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println(reverse(-2147483410));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static int reverse(int x) {
        int temp = 0;
        int reverse = 0;
        while(x!=0) {
            if (reverse > 0) {
                if(Integer.MAX_VALUE/10 < reverse || Integer.MAX_VALUE/10 == reverse && temp > 7) return 0;
            } else {
                if(Integer.MIN_VALUE/10 > reverse || Integer.MAX_VALUE/10 == reverse && temp < -8) return 0;
            }
            temp = x%10;
            reverse = reverse *10 + temp;
            x /= 10;
        }
        return reverse;
    }
}
