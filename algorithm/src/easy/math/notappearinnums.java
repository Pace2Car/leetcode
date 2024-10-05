package easy.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class notappearinnums {
    
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
    
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums); // 12233478
        for (int i = 0; i < nums.length; i++) {
            int target = i + 1;
            if (nums[i] != target) {
                if (!ans.contains(target)) {
                    ans.add(target);
                }
            }
        }
        return ans;
    }
}
