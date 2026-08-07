class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                char c=Character.toLowerCase(s.charAt(i));
                s1+=c;
            }
        }
        int left=0;
        int right=s1.length()-1;
        while(left<right){
            if(s1.charAt(left)!=s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}