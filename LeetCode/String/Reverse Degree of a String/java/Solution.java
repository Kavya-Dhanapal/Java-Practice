class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int i=0;
        int p=0;
        int d=0;
        while(i!=s.length()){
           d=Math.abs((int)s.charAt(i)-'z')+1;
            p=d*(i+1);
         sum=sum+p;
          i++;
        }
        return sum;
        
    }
}