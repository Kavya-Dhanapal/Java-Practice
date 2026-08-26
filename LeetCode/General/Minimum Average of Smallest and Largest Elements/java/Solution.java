1class Solution {
2    public double minimumAverage(int[] nums) {
3     Arrays.sort(nums);
4
5        double ans = Double.MAX_VALUE;
6
7        int left = 0;
8        int right = nums.length - 1;
9
10        while (left < right) {
11            double avg = ((double) nums[left] + nums[right]) / 2;
12            ans = Math.min(ans, avg);
13
14            left++;
15            right--;
16        }
17
18        return ans;
19    }
20}