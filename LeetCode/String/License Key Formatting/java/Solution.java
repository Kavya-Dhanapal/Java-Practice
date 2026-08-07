class Solution {
    public String licenseKeyFormatting(String s, int k) {
     StringBuilder clean =new StringBuilder();
     for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
            char c=Character.toUpperCase(s.charAt(i));
            //String b=c.toString();
            clean.append(c);
        }
        } 
        StringBuilder sb =new StringBuilder();
        int count=0;
        for(int i=clean.length()-1;i>=0;i--){
             sb.append(clean.charAt(i));
              count++;
           if(count==k && i!=0){
             sb.append('-');
             count=0;
        }
       
        }  
        return sb.reverse().toString();
    }
}