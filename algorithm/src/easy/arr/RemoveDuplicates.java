package easy.arr;

/**
 * 26. 删除排序数组中的重复项
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * @author Pace2Car
 * @date 2019/8/26 15:58
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(arr));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static int removeDuplicates(int[] nums) {
        int ans = 0;
        for (int i = 1;i < nums.length; i++) {
            if (nums[i] == nums[ans]) {
            } else {
                ans++;
                nums[ans] = nums[i];
            }
        }
        return ans+1;
    }
}
