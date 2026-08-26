1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        List<List<Integer>> l=new ArrayList<>();
4        Arrays.sort(arr);
5        int min=Integer.MAX_VALUE;
6        
7        for(int i=0;i<arr.length-1;i++){
8         if(arr[i+1]-arr[i]<=min){
9                min=arr[i+1]-arr[i];
10              }
11        }
12        for(int i=0;i<arr.length-1;i++){
13         List<Integer> l1=new ArrayList<>();
14         if(arr[i+1]-arr[i]==min){
15            l1.add(arr[i]);
16            l1.add(arr[i+1]);
17            l.add(new ArrayList<>(l1));
18         }
19         }
20         return l;
21    }
22}