import java.util.*;
public class Week2Problems {
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target) {
                return i;
            }
        }
        return -1;
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int threeSum = nums[i] + nums[j] + nums[k];
                if (threeSum == 0) {
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    j++;
                    k--;
                }
                else if (threeSum < 0) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return answer;
    }
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x == '(') {
                stack.push(')');
            }
            else if (x == '{') {
                stack.push('}');
            }
            else if (x == '[') {
                stack.push(']');
            }
            else if (stack.isEmpty() || stack.pop() != x) {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int startIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            while (set.contains(currentChar)) {
                set.remove(s.charAt(startIndex));
                startIndex++;
            }

            set.add(currentChar);
            maxLength = Math.max(maxLength, i - startIndex + 1);
        }
        return maxLength;
    }
    public static void main (String[] args) {
        int[] searchNums1 = {4, 5, 6, 7, 0, 1, 2};
        int[] searchNums2 = {1};
        System.out.println("Problem 1:  \n");
        System.out.println(search(searchNums1, 0));
        System.out.println(search(searchNums1, 3));
        System.out.println(search(searchNums2, 0));
        System.out.println();

        int[] threeSumNums1 = {-1,0,1,2,-1,-4};
        int[] threeSumNums2 = {0, 1, 1};
        int[] threeSumNums3 = {0, 0, 0};
        System.out.println("Problem 2: \n");
        System.out.println(threeSum(threeSumNums1));
        System.out.println(threeSum(threeSumNums2));
        System.out.println(threeSum(threeSumNums3));
        System.out.println();

        int[] maxAreaNums1 = {1,8,6,2,5,4,8,3,7};
        int[] maxAreaNums2 = {1,1};
        System.out.println("Problem 3: \n");
        System.out.println(maxArea(maxAreaNums1));
        System.out.println(maxArea(maxAreaNums2));
        System.out.println();

        String isAnagramString1 = "anagram";
        String isAnagramString1Switched = "nagaram";
        String isAnagramString2 = "rat";
        String isAnagramString2Switched = "car";
        System.out.println("Problem 4: \n");
        System.out.println(isAnagram(isAnagramString1, isAnagramString1Switched));
        System.out.println(isAnagram(isAnagramString2, isAnagramString2Switched));
        System.out.println();

        System.out.println("Problem 5: \n");
        System.out.println();

        String validParenthesesString1 = "()";
        String validParenthesesString2 = "()[]{}";
        String validParenthesesString3 = "(]";
        String validParenthesesString4 = "([])";
        System.out.println("Problem 6: \n");
        System.out.println(isValid(validParenthesesString1));
        System.out.println(isValid(validParenthesesString2));
        System.out.println(isValid(validParenthesesString3));
        System.out.println(isValid(validParenthesesString4));
        System.out.println();

        String lengthOfLongestSubstringString1 = "abcabcbb";
        String lengthOfLongestSubstringString2 = "bbbbb";
        String lengthOfLongestSubstringString3 = "pwwkew";
        System.out.println("Problem 7: \n");
        System.out.println(lengthOfLongestSubstring(lengthOfLongestSubstringString1));
        System.out.println(lengthOfLongestSubstring(lengthOfLongestSubstringString2));
        System.out.println(lengthOfLongestSubstring(lengthOfLongestSubstringString3));
        System.out.println();
    }
}