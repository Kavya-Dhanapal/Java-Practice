class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        int i=0;
        for(String val:words){
            if(val.contains(String.valueOf(x))){
                list.add(i);
               
            }
             i++;
        }
        return list;
    }
}