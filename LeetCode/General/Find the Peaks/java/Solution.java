1class Solution {
2    public List<Integer> findPeaks(int[] mountain) {
3        List<Integer> l=new ArrayList<>();
4        for(int i=1;i<mountain.length-1;i++){
5            if(mountain[i-1]<mountain[i] && mountain[i]>mountain[i+1]){
6                l.add(i);
7            }
8        }
9        return l;
10    }
11}