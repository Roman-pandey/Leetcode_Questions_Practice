import java.util.Arrays;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        // Convert negative numbers to positive
        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        int min = nums[0];
        // Find smallest value
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // If one odd operation is left
        if (k % 2 != 0) {
            sum -= 2 * min;
        }
        return sum;
    }
}