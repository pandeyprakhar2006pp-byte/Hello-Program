import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int index = 0;

        for (int num : set) {
            nums[index++] = num;
        }

        Arrays.sort(nums, 0, index);

        return index;
    }
}