package easy.string;

/**
 * 0. KMP算法小样
 * 在计算机科学中，Knuth-Morris-Pratt字符串查找算法（简称为KMP算法）
 * 可在一个主文本字符串S内查找一个词W的出现位置。
 *
 * @author Pace2Car
 * @date 2019/10/24 15:55
 */
public class KMPDemo {
    public static void main(String[] args) {
        String str = "DABCCAF CABCCAB";
        String pat = "ABCCAB";
        System.out.println(kmp(str, pat));
    }


    // 寻找待匹配串的部分匹配值，放在next数组中
    // 已知next[j] = k,利用递归的思想求出next[j+1]的值
    // 如果已知next[j] = k,如何求出next[j+1]呢?具体算法如下:
    // 1. 如果p[j] = p[k], 则next[j+1] = next[k] + 1;
    // 2. 如果p[j] != p[k], 则令k=next[k],如果此时p[j]==p[k],则next[j+1]=k+1,
    // 如果不相等,则继续递归前缀索引,令 k=next[k],继续判断,直至k=-1(即k=next[0])或者p[j]=p[k]为止
    static void getNext(String pattern, int[] next) {
        int i = 0;
        int j = -1;
        next[0] = -1;// next数组中next[0]为-1
        int len = pattern.length();
        while (i < len - 1) {
            if (j == -1 || pattern.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
    }

    static int kmp(String target, String pattern) {
        int i = 0;
        int j = 0;
        int tlen = target.length();
        int plen = pattern.length();
        int[] next = new int[plen];
        getNext(pattern, next);
        while (i < tlen && j < plen) {
            // 如果j = -1,或者当前字符匹配成功(src[i] = ptn[j]),都让i++,j++
            if (target.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else if (next[j] == -1) {
                i++;
                j = 0;
            } else {
                // 如果j!=-1且当前字符匹配失败,则令i不变,j=next[j],即让pattern模式串右移j-next[j]个单位
                j = next[j];
            }
            if (j == plen) {
                return i - j;
            }
        }
        return -1;
    }
}
