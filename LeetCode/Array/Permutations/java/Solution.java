import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        while (true) {
            List<Integer> curr = new ArrayList<>();
            for (int x : nums) {
                curr.add(x);
            }
            ans.add(curr);

            if (!nextPermutation(nums)) {
                break;
            }
        }

        return ans;
    }

    private boolean nextPermutation(int[] nums) {
        int piv = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                piv = i;
                break;
            }
        }

        if (piv == -1) {
            return false;
        }

        for (int i = nums.length - 1; i > piv; i--) {
            if (nums[i] > nums[piv]) {
                int temp = nums[i];
                nums[i] = nums[piv];
                nums[piv] = temp;
                break;
            }
        }

        reverse(nums, piv + 1);
        return true;
    }

    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}