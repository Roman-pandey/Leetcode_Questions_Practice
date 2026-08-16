class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } 
            else {
                // Try deleting the left character
                int left = i + 1;
                int right = j;
                while (left < right && s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }

                if (left >= right) {
                    return true;
                }
                // Try deleting the right character
                left = i;
                right = j - 1;

                while (left < right && s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }
                return left >= right;
            }
        }

        return true;
    }
}