class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        boolean v= false;
        List<String> list=new ArrayList<>();
       for(int i=0;i<words.length;i++){
         v=ans(words[i],pattern);
         if(v){
            list.add(words[i]);
         }
       }
       return list;
    }
        public static boolean ans(String s,String p){
        
            int sarr[]=new int[256];
            int tarr[]=new int[256];
            for(int i=0;i<s.length();i++){
                char ch1=s.charAt(i);
                char ch2=p.charAt(i);
                if(sarr[ch1]==0 && tarr[ch2]==0){
                    sarr[ch1]=ch2;
                    tarr[ch2]=ch1;
                }
                else if(sarr[ch1]!=ch2 || tarr[ch2]!=ch1){
                    return false;
                }
            }
            return true;
        
        }

    
}