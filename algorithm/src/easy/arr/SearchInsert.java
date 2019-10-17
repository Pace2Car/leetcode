package easy.arr;

/**
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 *
 * @author chenjiahao
 * @date 2019/8/26 17:41
 */
public class SearchInsert {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = new int[]{1, 2, 3, 4, 9};

        System.out.println(searchInsert(arr, 7));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    /**
     * 直线解法
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || nums[0] > target) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
        }
        return nums.length;
    }

    /**
     * 二分法
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsertBinary(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1;
        if (nums[len - 1] < target) return len;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
