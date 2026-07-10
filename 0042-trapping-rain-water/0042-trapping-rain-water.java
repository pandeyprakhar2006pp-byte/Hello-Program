class Solution {

    public int trap(int[] height) {

        int lp = 0;
        int rp = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int trappedWater = 0;

        while (lp <= rp) {

            if (height[lp] <= height[rp]) {

                if (height[lp] >= leftMax) {
                    leftMax = height[lp];
                } else {
                    trappedWater += leftMax - height[lp];
                }

                lp++;

            } else {

                if (height[rp] >= rightMax) {
                    rightMax = height[rp];
                } else {
                    trappedWater += rightMax - height[rp];
                }

                rp--;
            }
        }

        return trappedWater;
    }
}