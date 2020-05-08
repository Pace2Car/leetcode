package draft;

import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.Executors;

/**
 * @author Pace2Car
 * @date 2019/8/23 13:41
 */
public class NumberDraft {
    public static void main(String[] args) {
        System.out.println(getSixRandomNum());
    }

    public static int getSixRandomNum() {
        // 生成6位随机数
        double random = Math.random();
        System.out.println(random);
        System.out.println(random * 9);
        System.out.println(random * 9 + 1);
        System.out.println((random * 9 + 1) * 100000);
        System.out.println((int) ((random * 9 + 1) * 100000));
        return (int) ((random * 9 + 1) * 100000);
    }
}
