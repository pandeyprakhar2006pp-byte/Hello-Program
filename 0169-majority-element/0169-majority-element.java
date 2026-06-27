class Solution {
    public int majorityElement(int[] arr) {
          int maxFreq = 0;
          int maxFreqElement = arr[0];
          for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxFreq) {
                maxFreq = count;
                maxFreqElement = arr[i];
    }
   
}
 return maxFreqElement;
    }
    
}