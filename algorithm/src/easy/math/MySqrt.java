package easy.math;

/**
 * 69. x 的平方根
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * @author Pace2Car
 * @date 2019/10/18 11:10
 */
public class MySqrt {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//        int a = 2147395599;
        int a = 2;

//        System.out.println(mySqrt(a));
//        System.out.println(mySqrtOther(a));
        System.out.println(mySqrtDouble(a));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static int mySqrt(int x) {
        if (x == 0) return 0;
        if (x <= 2) return 1;
        long mid = x / 2;
        long right = x;
        long left = 0;
        while (left < right) {
            if (mid * mid == x) {
                return (int) mid;
            }
            if (mid * mid > x) {
                if ((mid - 1) * (mid - 1) <= x) return (int) mid - 1;
                right = mid;
                mid = left + (mid - left) / 2;
            } else {
                left = mid;
                mid = mid + (right - mid) / 2;
            }
        }
        return (int) right;
    }

    public static double mySqrtDouble(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        double mid = x / 2;
        double right = x;
        double left = 0;
        while (left < right) {
            if (mid * mid == x || Math.abs(x - (mid * mid)) < 0.001) {
                return mid;
            }
            if (mid * mid > x) {
//                if ((mid - 1) * (mid - 1) <= x) return mid - 1;
                right = mid;
                mid = left + (mid - left) / 2;
            } else {
                left = mid;
                mid = mid + (right - mid) / 2;
            }
        }
        return right;
    }

    public static int mySqrtOther(int x) {
        long mid = 0;
        long start = 0;
        long end = x/2+1;
        while(start <= end) {
            mid = (start + end)/2;
            if(mid*mid == x) {
                return (int)mid;
            } else if(mid*mid < x) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return (int)start-1;
    }
}
