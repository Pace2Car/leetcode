package easy.math;

/**
 * 67. 二进制求和
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * @author Pace2Car
 * @date 2019/10/18 10:09
 */
public class AddBinary {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String a = "";
        String b = "1111"; // 100101

        System.out.println(addBinary(a, b));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static String addBinary(String a, String b) {
//        if (a.length() < 1) return b;
//        if (b.length() < 1) return a;
        int temp = 0;
        String bigNum = a.length() > b.length() ? a : b;
        String litNum = a.length() > b.length() ? b : a;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < litNum.length(); i++) {
            int aa = Character.getNumericValue(bigNum.charAt(bigNum.length()-1-i));
            int bb = Character.getNumericValue(litNum.charAt(litNum.length()-1-i));
            int i1 = aa + bb + temp;
            if (i1 == 2) {
                temp = 1;
                sb.append(0);
            } else if (i1 == 3) {
                temp = 1;
                sb.append(1);
            } else {
                temp = 0;
                sb.append(i1);
            }
        }
        if (bigNum.length() != litNum.length()) {
            for (int i = bigNum.length() - litNum.length() - 1; i >= 0; i--) {
                int i1 = Character.getNumericValue(bigNum.charAt(i)) + temp;
                if (i1 == 2) {
                    sb.append(0);
                    temp = 1;
                } else if (i1 == 3) {
                    temp = 1;
                    sb.append(1);
                }  else {
                    sb.append(i1);
                    temp = 0;
                }
            }
        }
        if (temp == 1) sb.append(temp);
        sb.reverse();
        return sb.toString();
    }
}
