class Solution {
    public int secondHighest(String s) {
         int max=-1;
        int sec=-1;
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(Character.isDigit(c))
{        int k=c-'0';
    if(max<k){
              sec=max;
              max=k;
          }
          else if(max!=sec && max>k && sec<k){
              sec=k;
          }
      }
      }
      if(sec==max|| sec==-1){
          return -1;
      }
      return sec;
    }
}