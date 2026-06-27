class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int ele:nums){
            result^=ele;
        }
        return result;
        
    }
}