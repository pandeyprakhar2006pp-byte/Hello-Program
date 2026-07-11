class Solution {

    public String longestPalindrome(String s) {

        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd Length
            int left = i - 1;
            int right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            int len = right - left - 1;

            if (len > maxLen) {
                maxLen = len;
                start = left + 1;
            }

            // Even Length
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            len = right - left - 1;

            if (len > maxLen) {
                maxLen = len;
                start = left + 1;
            }
        }

        return s.substring(start, start + maxLen);
    }
}