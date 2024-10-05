package easy.dynamicprogram;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 *
 * @author Pace2Car
 * @date 2019/10/18 14:10
 */
public class ClimbStairs {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int a = 20;
        System.out.println(climbStairs(a));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int previous = 1;
        int preprevious = 1;
        int now = previous + preprevious;
        while (n > 2) {
            preprevious = previous;
            previous = now;
            now = previous + preprevious;
            n--;
        }
        return now;
    }
}
