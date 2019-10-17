package easy.sum;

/**
 * 两数求和
 *
 * @author chenjiahao
 * @date 2019/8/23 11:45
 */
public class TwoNumberSum {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 18;
        int[] ints = twoSum2(arr, target);
        for (int i : ints) {
            System.out.println(i);
        }
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    /**
     * 1. 两数之和
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new RuntimeException("no such sortNumbers");
    }

    /**
     * 167. 两数之和 II - 输入有序数组
     * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
     *
     * @param sortNumbers 有序数组
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] sortNumbers, int target) {
        int i = 0;
        int j = sortNumbers.length - 1;
        while (i < j) {
            if (sortNumbers[i] + sortNumbers[j] == target) {
                return new int[]{i + 1, j + 1};
            } else if (sortNumbers[i] + sortNumbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        throw new RuntimeException("no such sortNumbers");
    }
}
