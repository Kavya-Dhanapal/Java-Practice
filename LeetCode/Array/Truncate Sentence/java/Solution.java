class Solution {
    public String truncateSentence(String s, int k) {
       String s1[]=s.trim().split(" "); 
       String s2[]=new String[k];
       int i=0;
      /* while(s2.length<k){
        s2[i]=s1[i];
        i++;
       }*/
       String result="";
       while(i<k){
        result+=s1[i]+" ";
        i++;
       }
       return result.trim();
    }
}