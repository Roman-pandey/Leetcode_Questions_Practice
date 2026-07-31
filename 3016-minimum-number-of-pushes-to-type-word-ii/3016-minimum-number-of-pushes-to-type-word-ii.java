import java.util.*;

class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        // Count frequency
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
        // Sort frequencies
        Arrays.sort(freq);
        int ans = 0;
        int cost = 1;
        int count = 0;

        // Traverse from highest frequency
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;
            ans += freq[i] * cost;
            count++;
            if (count == 8) {
                cost++;
                count = 0;
            }
        }
        return ans;
    }
}