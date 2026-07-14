class Solution {

    public void dfs(int[][] image, int i, int j, int color, int orgColor) {

        if (i < 0 || j < 0 || i >= image.length || j >= image[0].length ||
            image[i][j] != orgColor || image[i][j] == color) {
            return;
        }

        image[i][j] = color;

        // Top
        dfs(image, i - 1, j, color, orgColor);

        // Right
        dfs(image, i, j + 1, color, orgColor);

        // Bottom
        dfs(image, i + 1, j, color, orgColor);

        // Left
        dfs(image, i, j - 1, color, orgColor);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int orgColor = image[sr][sc];

        if (orgColor == color) {
            return image;
        }

        dfs(image, sr, sc, color, orgColor);

        return image;
    }
}