package easy.arr;

import java.math.BigInteger;

/**
 * 66. 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * @author Pace2Car
 * @date 2019/10/17 16:41
 */
public class PlusOne {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//        int[] digits = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//        int[] digits = new int[]{9, 9, 9};
        int[] digits = new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};

        int[] ints = plusOne(digits);

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += 1;
            if (digits[i] == 10) {
                digits[i] = 0;
                continue;
            }
            return digits;
        }
        int[] ints = new int[digits.length + 1];
        ints[0] = 1;
        return ints;
    }
}
