class Solution {
    public String longestPalindrome(String s) {
          int left=0;
          
          String str="";
          int max=0;
          while(left<s.length()){
            int right=left+1;
          while(right<=s.length()){
            String s1=s.substring(left,right);
              if(palin(s1)){
                if(s1.length()>max){
                str=s1;
              max=s1.length();
                }
              }
              right++;
          }
          left++;
          }
          return str;
    }
    public static boolean palin(String s1){
                int l=0;
                int r=s1.length()-1;
                while(l<r){
                if(s1.charAt(l)!=s1.charAt(r)){
                   return false;
                }
                l++;
                r--;         }
    return true;
    }
}