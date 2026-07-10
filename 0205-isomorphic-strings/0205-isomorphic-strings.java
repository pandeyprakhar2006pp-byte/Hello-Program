class Solution {
    public boolean isIsomorphic(String s, String t) {

        int[] map = new int[256];
        boolean[] visited = new boolean[256];

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map[ch1] == 0) {

                if (visited[ch2]) {
                    return false;
                }

                map[ch1] = ch2;
                visited[ch2] = true;

            } else {

                if (map[ch1] != ch2) {
                    return false;
                }
            }
        }

        return true;
    }
}