import java.util.*;

class Solution {

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] nsl = new int[n];
        int[] nsr = new int[n];

        Stack<Integer> s = new Stack<>();

        // Next Smaller Left
        for (int i = 0; i < n; i++) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        s.clear();

        // Next Smaller Right
        for (int i = n - 1; i >= 0; i--) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = n;
            } else {
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int width = nsr[i] - nsl[i] - 1;
            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}