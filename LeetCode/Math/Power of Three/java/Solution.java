class Solution {
    public boolean isPowerOfThree(int n) {
    if(n<0){
        return false;
    }
    int val=1;
    for(int i=1;i<=31;i++){
        if(val==n){
            return true;
       }
       else{
        val*=3;
       }
    }
    return false;
    }
}