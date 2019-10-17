package easy.arr;

/**
 * 27. 移除元素
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @author chenjiahao
 * @date 2019/8/26 16:25
 */
public class RemoveElement {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeElement(arr, 2));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static int removeElement(int[] nums, int val) {
        int ans = 0;
        for (int i = 0;i < nums.length; i++) {
            if (nums[i] == val) {

            } else {
                nums[ans] = nums[i];
                ans++;
            }
        }
        return ans;
    }
}
