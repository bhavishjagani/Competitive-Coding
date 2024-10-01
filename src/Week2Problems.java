public class Week2Problems {
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target) {
                return i;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        int[] searchNums1 = {4, 5, 6, 7, 0, 1, 2};
        int[] searchNums2 = {1};
        System.out.println("Problem 1: \n");
        System.out.println(search(searchNums1, 0));
        System.out.println(search(searchNums1, 3));
        System.out.println(search(searchNums2, 0));
        System.out.println();
    }
}