class Solution {
    public String removeStars(String s) {
        List<Character> l=new ArrayList<>();
        for(char i:s.toCharArray()){
            if(i=='*'){
                l.remove(l.size()-1);
            }
            else{
                l.add(i);
            }
        }
        String s1="";
        for(char i:l){
            s1+=i;
        }
        return s1;
    }
}