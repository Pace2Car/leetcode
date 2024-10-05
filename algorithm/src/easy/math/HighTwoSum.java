package easy.math;

import java.util.Arrays;

public class HighTwoSum {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{11, 7, 2, 15}, 9);
        System.out.println(ints);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        int i = 0;
        int j = temp.length -1;
        int[] ans = new int[]{i,j};
        while(i<j) {
            if (temp[i] + temp[j] == target) {
                ans = new int[]{temp[i], temp[j]};
                break;
            }
            if (temp[i] + temp[j] > target) {
                j--;
            }
            if (temp[i] + temp[j] < target) {
                i++;
            }
        }
        i = 0;
        j = nums.length -1;
        while (i < nums.length - 1 && j > 0) {
            if (nums[i] != ans[0]) {
                i++;
            }
            if (nums[j] != ans[1]) {
                j--;
            }
            if (nums[i] == ans[0] && nums[j] == ans[1]) {
                return new int[]{i, j};
            }
        }
        return new int[]{i,j};
    }
}
