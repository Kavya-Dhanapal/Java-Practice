class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            // Check if current index is reachable
            if (i > max) {
                return false;
            }

            // Update the farthest reachable index
            max = Math.max(max, i + nums[i]);

            // If we can already reach or pass the last index
            if (max >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}