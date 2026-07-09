class Solution {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] visited = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                count++;
                dfs(isConnected, visited, i);
            }
        }

        return count;
    }

    private void dfs(int[][] arr, int[] visited, int curr) {
        visited[curr] = 1;

        for (int i = 0; i < arr[curr].length; i++) {
            if (arr[curr][i] == 1 && visited[i] == 0) {
                dfs(arr, visited, i);
            }
        }
    }
}