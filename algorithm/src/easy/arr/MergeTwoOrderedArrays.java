package easy.arr;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *
 * @author Pace2Car
 * @date 2020/5/9 17:32
 */
public class MergeTwoOrderedArrays {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] a = new int[]{2, 0};
        int[] b = new int[]{1};
        merge(a, 1, b, 1);
        System.out.println(Arrays.toString(a));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;
        while (i >= 0 || j >= 0) {
            if (i < 0) {
                nums1[index--] = nums2[j--];
            } else if (j < 0) {
                nums1[index--] = nums1[i--];
            } else if (nums1[i] > nums2[j]) {
                nums1[index--] = nums1[i--];
            } else {
                nums1[index--] = nums2[j--];
            }
        }
    }
}
