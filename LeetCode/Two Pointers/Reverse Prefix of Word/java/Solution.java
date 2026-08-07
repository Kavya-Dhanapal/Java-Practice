class Solution {
    public String reversePrefix(String word, char ch) {
        char a[]=word.toCharArray();
        int s=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==ch){
               s=i;
               break; 
            }
        }
        int l=0;
        int r=s;
        while(l<r) {
        char temp=a[l];
           a[l]=a[r];
           a[r]=temp;
           l++;
           r--;
        }  
        return new String(a);
         }
}