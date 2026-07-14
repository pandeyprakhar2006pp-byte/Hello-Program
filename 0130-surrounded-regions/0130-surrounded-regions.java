class Solution {

    public void dfs(int row, int col, char[][] board, boolean[][] vis,
                    int[] delRow, int[] delCol) {

        vis[row][col] = true;
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < 4; i++) {
            int nRow = row + delRow[i];
            int nCol = col + delCol[i];

            if (nRow >= 0 && nRow < n &&
                nCol >= 0 && nCol < m &&
                !vis[nRow][nCol] &&
                board[nRow][nCol] == 'O') {

                dfs(nRow, nCol, board, vis, delRow, delCol);
            }
        }
    }

    public void solve(char[][] board) {

        int n = board.length;
        int m = board[0].length;

        boolean[][] vis = new boolean[n][m];

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        // First and Last Row
        for (int j = 0; j < m; j++) {

            if (!vis[0][j] && board[0][j] == 'O')
                dfs(0, j, board, vis, delRow, delCol);

            if (!vis[n - 1][j] && board[n - 1][j] == 'O')
                dfs(n - 1, j, board, vis, delRow, delCol);
        }

        // First and Last Column
        for (int i = 0; i < n; i++) {

            if (!vis[i][0] && board[i][0] == 'O')
                dfs(i, 0, board, vis, delRow, delCol);

            if (!vis[i][m - 1] && board[i][m - 1] == 'O')
                dfs(i, m - 1, board, vis, delRow, delCol);
        }

        // Convert remaining O to X
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (!vis[i][j] && board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }
}