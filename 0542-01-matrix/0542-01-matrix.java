class Solution {

    class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int[][] updateMatrix(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[][] ans = new int[n][m];
        boolean[][] vis = new boolean[n][m];

        Queue<Pair> q = new LinkedList<>();

        // Put all 0's in queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new Pair(i, j));
                    vis[i][j] = true;
                }
            }
        }

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while (!q.isEmpty()) {

            Pair curr = q.poll();

            int r = curr.row;
            int c = curr.col;

            for (int i = 0; i < 4; i++) {

                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < n &&
                    nc >= 0 && nc < m &&
                    !vis[nr][nc]) {

                    vis[nr][nc] = true;
                    ans[nr][nc] = ans[r][c] + 1;
                    q.offer(new Pair(nr, nc));
                }
            }
        }

        return ans;
    }
}