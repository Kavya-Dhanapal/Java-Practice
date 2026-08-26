1class Solution {
2    public List<List<Integer>> findSubsequences(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        HashSet<List<Integer>> set = new HashSet<>();
5
6        sub(nums, 0, ans, new ArrayList<>(), set);
7
8        return ans;
9    }
10
11    public static void sub(int[] nums, int ind,
12                           List<List<Integer>> ans,
13                           List<Integer> temp,
14                           HashSet<List<Integer>> set) {
15
16        if (ind == nums.length) {
17            if (temp.size() > 1) {
18                boolean s = true;
19
20                for (int i = 0; i < temp.size() - 1; i++) {
21                    if (temp.get(i) > temp.get(i + 1)) {
22                        s = false;
23                        break;
24                    }
25                }
26
27                if (s && set.add(new ArrayList<>(temp))) {
28                    ans.add(new ArrayList<>(temp));
29                }
30            }
31            return;
32        }
33
34        temp.add(nums[ind]);
35        sub(nums, ind + 1, ans, temp,set);
36        temp.remove(temp.size() - 1);
37
38        sub(nums, ind + 1, ans, temp,set);
39    }
40}