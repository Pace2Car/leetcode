package easy.sum;

/**
 * 633. 平方数之和
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 *
 * @author Pace2Car
 * @date 2020/5/8 16:10
 */
public class SumOfSquares {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int target = 2;
        System.out.println(judgeSquareSum(target));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int) Math.sqrt(c);
        int sum = 0;
        while (a <= b) {
            sum = a * a + b * b;
            if (c == sum) {
                return true;
            } else if (c < sum) {
                b--;
            } else {
                a++;
            }
        }
        return false;
    }
}
