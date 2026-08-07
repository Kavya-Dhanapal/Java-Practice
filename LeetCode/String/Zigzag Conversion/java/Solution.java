class Solution {
    public String convert(String s, int r) {
         int a[]=new int[s.length()];
        
        int ind=0;
        if(r<=1|| r>=s.length()){
        System.out.print(s);
          }
      else{
         while(ind<s.length()){
        for(int i=0;i<r && ind<s.length();i++){
            a[ind++]=i;
        }
          for(int i=r-2;i>0 && ind<s.length();i--){
            a[ind++]=i;
         }
        }}
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<r;i++){
            for(int j=0;j<s.length();j++){
                 if(a[j]==i){
                sb.append(s.charAt(j));
            }
          }
        }
        return sb.toString();
      }
    }
        
  