class Solution {
    public String reverseWords(String s) {

        int n = s.length();
        String ans = "";

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();

        for (int i = 0; i < n; i++) {

            String word = "";

            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            while (i < n && s.charAt(i) != ' ') {
                word += s.charAt(i);
                i++;
            }

            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            word = temp.toString();

            if (word.length() > 0) {
                ans += " " + word;
            }
        }

        return ans.substring(1);
    }
}