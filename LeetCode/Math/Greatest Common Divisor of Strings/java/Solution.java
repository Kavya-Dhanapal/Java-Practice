class Solution {
    public String gcdOfStrings(String str1, String str2) {
       if (!(str1 + str2).equals(str2 + str1)) {
    return "";
}
        int l=0;
     l=call(str1.length(),str2.length());
     return str1.substring(0,l);
    }
    public static  int call(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}