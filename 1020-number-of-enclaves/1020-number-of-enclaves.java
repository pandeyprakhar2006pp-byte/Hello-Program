import java.util.*;

class Solution {

    class Pair {
        int row, col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int numEnclaves(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][m];

        // Add all boundary 1's
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {

                    if (grid[i][j] == 1 && !vis[i][j]) {
                        q.offer(new Pair(i, j));
                        vis[i][j] = true;
                    }
                }
            }
        }

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        while (!q.isEmpty()) {

            Pair curr = q.poll();
            int row = curr.row;
            int col = curr.col;

            for (int i = 0; i < 4; i++) {

                int newRow = row + delRow[i];
                int newCol = col + delCol[i];

                if (newRow >= 0 && newRow < n &&
                    newCol >= 0 && newCol < m &&
                    !vis[newRow][newCol] &&
                    grid[newRow][newCol] == 1) {

                    vis[newRow][newCol] = true;
                    q.offer(new Pair(newRow, newCol));
                }
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1 && !vis[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }
}