1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        List<Integer> l=new ArrayList<>();
4        for(int i: nums){
5            l.add(i);
6        }
7        for(int i=1;i<=nums.length;i++){
8            int j=k*i;
9            if(!l.contains(j)){
10            return j;
11            }
12        }
13        return (nums.length+1)*k;
14    }
15}