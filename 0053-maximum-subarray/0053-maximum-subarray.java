class Solution {
    public int maxSubArray(int[] arr) {
         int maxSum = arr[0];        // Initialize with first element
         int sum = arr[0];           // Start with first element

        for (int i = 1; i < arr.length; i++) {
            // Either extend the previous subarray or start a new one
            sum = Math.max(arr[i], sum + arr[i]);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
        
    }
