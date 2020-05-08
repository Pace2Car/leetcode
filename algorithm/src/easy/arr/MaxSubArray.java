package easy.arr;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * @author Pace2Car
 * @date 2019/8/27 9:21
 */
public class MaxSubArray {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 4};

        System.out.println(maxSubArray(arr));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    /**
     * O(n)解法
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int maxSum = nums[0];
        int nowSum = 0 ;
        for(int i = 0; i < nums.length;i++) {
            nowSum+=nums[i];
            if (nowSum > maxSum) {
                maxSum = nowSum;
            }
            if (nowSum < 0) {
                nowSum = 0;
            }
        }
        return maxSum;
    }
}
