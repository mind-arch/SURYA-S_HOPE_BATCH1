class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && count == 0) {
                arr[0] = i;
                arr[1] = i; 
                count++;
            }
            else if (nums[i] == target && count != 0) {
                arr[1] = i;
                count++;
            }
        }

        return arr;
    }
}