class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
       for(String word:words){
        Boolean v=true;
        for(char c:word.toCharArray()){
            if(!allowed.contains(String.valueOf(c))){
                v=false;
            }
        }
        if(v){
            count++;
        }
       }
       return count;
    }
}