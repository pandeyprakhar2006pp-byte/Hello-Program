class Solution {

    public int trap(int[] height) {

        int n = height.length;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Left Max Array
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Right Max Array
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int water = 0;

        // Calculate Trapped Water
        for (int i = 0; i < n; i++) {

            int level = Math.min(leftMax[i], rightMax[i]);

            water += level - height[i];
        }

        return water;
    }
}