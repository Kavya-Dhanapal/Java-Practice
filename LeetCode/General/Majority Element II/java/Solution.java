1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int n=nums.length/3;
4        HashMap<Integer,Integer> map=new HashMap<>();
5        List<Integer> l=new ArrayList<>();
6        for(int i=0;i<nums.length;i++){
7            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
8        }
9        for(int i:map.keySet()){
10            if(map.get(i)>n){
11                l.add(i);
12            }
13        }
14        return l;
15    }
16}