import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Week1Problems {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int second = target-nums[i];
            if (numsMap.containsKey(second)) {
                return new int[] {i, numsMap.get(second)};
            }
            numsMap.put(nums[i], i);
        }
        return null;
    }
    public static void main (String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {3,2,4};
        int[] nums3 = {3,3};
        System.out.println(Arrays.toString(twoSum(nums1, 9)));
        System.out.println(Arrays.toString(twoSum(nums2, 6)));
        System.out.println(Arrays.toString(twoSum(nums3, 6)));
    }
}