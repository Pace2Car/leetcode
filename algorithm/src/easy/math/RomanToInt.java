package easy.math;

/**
 * 13.罗马数字转整数
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 *
 * @author chenjiahao
 * @date 2019/8/23 15:11
 */
public class RomanToInt {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println(romanToIntSamrtOfOthers("MMMMCMXCVIV"));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    /**
     * 别人的聪明解法
     * @param s
     * @return
     */
    public static int romanToIntSamrtOfOthers(String s) {
        int result = 0;
        int last = 0;
        for (int i = s.length()-1; i >= 0 ; i--) {
            int c = romanCharToInt(s.charAt(i));
            if (last > c) {
                result -= c;
            } else {
                result += c;
            }
            last = c;
        }
        return result;
    }

    private static int romanCharToInt(char c) {
        switch (c) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default  : throw new RuntimeException("not a roman");
        }
    }

    /**
     * 我的愚蠢解法
     * @param s
     * @return
     */
    public static int romanToIntStupidOfMine(String s) {
        int i = 0;
        int result = 0;
        char[] chars = s.toCharArray();
        while(i < chars.length) {
            switch(chars[i]) {
                case 'M':
                    result += 1000;
                    i++;
                    break;
                case 'D':
                    result += 500;
                    i++;
                    break;
                case 'C':
                    if (i < chars.length-1 && chars[i+1] == 'D') {
                        result += 400;
                        i+=2;
                    } else if (i < chars.length-1 && chars[i+1] == 'M') {
                        result += 900;
                        i+=2;
                    } else {
                        result += 100;
                        i++;
                    }
                    break;
                case 'L':
                    result += 50;
                    i++;
                    break;
                case 'X':
                    if (i < chars.length-1 && chars[i+1] == 'L') {
                        result += 40;
                        i+=2;
                    } else if (i < chars.length-1 && chars[i+1] == 'C') {
                        result += 90;
                        i+=2;
                    } else {
                        result += 10;
                        i++;
                    }
                    break;
                case 'V':
                    result += 5;
                    i++;
                    break;
                case 'I':
                    if (i < chars.length-1 && chars[i+1] == 'V') {
                        result += 4;
                        i+=2;
                    } else if (i < chars.length-1 && chars[i+1] == 'X') {
                        result += 9;
                        i+=2;
                    } else {
                        result++;
                        i++;
                    }
                    break;
                default:
                    break;
            }
        }
        return result;
    }
}
