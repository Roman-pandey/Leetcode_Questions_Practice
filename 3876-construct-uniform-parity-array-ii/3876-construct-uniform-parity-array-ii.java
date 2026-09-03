class Solution {
    public boolean uniformArray(int[] nums1) {

        int min = nums1[0];
        for (int i = 1; i < nums1.length; i++) {
            min = Math.min(min, nums1[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 != min % 2) {
                nums1[i] = nums1[i] - min;
            }
            if (nums1[i] % 2 != min % 2) {
                return false;
            }
        }
        return true;
    }
}