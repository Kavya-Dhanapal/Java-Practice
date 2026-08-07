class Solution {
    public int findPermutationDifference(String s, String t) {
           char c[]=s.toCharArray();
           char c1[]=t.toCharArray();
           int sum=0;
           for(int i=0;i<c.length;i++){
            for(int j=0;j<c1.length;j++){
                if(c[i]==c1[j]){
                    sum=sum+Math.abs(i-j);
                }
            }
           } 
           return sum;
    }
}