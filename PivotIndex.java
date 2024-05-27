class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        int last = nums.length - 1;

        if (nums[last] - nums[0] == 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[last] - nums[i] == nums[i - 1]) {
                return i;
            }
        }

        return -1;
    }
}

