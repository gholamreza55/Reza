package solution;

public class Solution {
    public static void main(String[] args) {
       // int[] nums = {2, 7, 11, 15};
        int[] num = {5, 2, 4};
        Solution solution = new Solution();
       /* int[] ints = solution.towSum(nums, 9);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

        */

        System.out.println("-------------------------------");

        int[] s = solution.towSum(num, 6);
        for (int i : s) {
            System.out.println(i);
        }
    }
    public int[] towSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
}
