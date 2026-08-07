class Solution {
    public int getLucky(String s, int k) {
      
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a' + 1;
            while (val > 0) {
                sum += val % 10;
                val /= 10;
            }
        }
         int j=0;
        if(k==1){
            return sum;
        }
       
        else{
            int i=0;
           while(i<k-1){
               j=0;
            while( sum>0){
                int digit=sum%10;
                j+=digit;
                sum=sum/10;
            }
            sum=j;
            i++;
            }
        } 
    return j;
    }
}