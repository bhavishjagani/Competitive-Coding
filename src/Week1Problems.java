import java.util.*;
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
    public static int maxProfit(int[] prices) {
        int price = prices[0], profit = 0;

        for (int j : prices) {
            if (j <= price) {
                price = j;
            }
            else {
                profit = Math.max(profit, j - price);
            }
        }
        return profit;
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
    public static int maxSubArray(int[] nums) {
        int sum = nums[0], maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], nums[i] + sum);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
    public static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
    public static void main (String[] args) {
//        int[] twoSumNums1 = {2,7,11,15};
//        int[] twoSumNums2 = {3,2,4};
//        int[] twoSumNums3 = {3,3};
//        System.out.println("Problem 1: \n");
//        System.out.println(Arrays.toString(twoSum(twoSumNums1, 9)));
//        System.out.println(Arrays.toString(twoSum(twoSumNums2, 6)));
//        System.out.println(Arrays.toString(twoSum(twoSumNums3, 6)));
//        System.out.println();
//
//        int[] prices1 = {7,1,5,3,6,4};
//        int[] prices2 = {7,6,4,3,1};
//        System.out.println("Problem 2: \n");
//        System.out.println(maxProfit(prices1));
//        System.out.println(maxProfit(prices2));
//        System.out.println();
//
//        int[] containsDuplicateNums1 = {1,2,3,1};
//        int[] containsDuplicateNums2 = {1,2,3,4};
//        int[] containsDuplicateNums3 = {1,1,1,3,3,4,3,2,4,2};
//        System.out.println("Problem 3: \n");
//        System.out.println(containsDuplicate(containsDuplicateNums1));
//        System.out.println(containsDuplicate(containsDuplicateNums2));
//        System.out.println(containsDuplicate(containsDuplicateNums3));
//        System.out.println();
//
//        System.out.println("Problem 4: \n");
//
//        int[] maxSubArrayNums1 = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] maxSubArrayNums2 = {1};
//        int[] maxSubArrayNums3 = {5, 4, -1, 7, 8};
//        System.out.println("Problem 5: \n");
//        System.out.println(maxSubArray(maxSubArrayNums1));
//        System.out.println(maxSubArray(maxSubArrayNums2));
//        System.out.println(maxSubArray(maxSubArrayNums3));
//        System.out.println();
//
//        System.out.println("Problem 6: \n");
//
//        int[] findMinNums1 = {3, 4, 5, 1, 2};
//        int[] findMinNums2 = {4, 5, 6, 7, 0, 1, 2};
//        int[] findMinNums3 = {11, 13, 15, 17};
//        System.out.println("Problem 7: ");
//        System.out.println(findMin(findMinNums1));
//        System.out.println(findMin(findMinNums2));
//        System.out.println(findMin(findMinNums3));
    }
}