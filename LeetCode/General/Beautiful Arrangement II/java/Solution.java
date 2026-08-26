1class Solution {
2    public int[] constructArray(int n, int k) {
3        int[] ans = new int[n];
4
5        int left = 1;
6        int right = k + 1;
7        int index = 0;
8
9        while (left <= right) {
10            if (index % 2 == 0) {
11                ans[index++] = left++;
12            } else {
13                ans[index++] = right--;
14            }
15        }
16
17        for (int i = k + 2; i <= n; i++) {
18            ans[index++] = i;
19        }
20
21        return ans;
22    }
23}