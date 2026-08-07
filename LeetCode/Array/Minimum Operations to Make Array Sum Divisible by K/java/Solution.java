class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
       } 
       int count=0;
       int r=0;
       
        if(sum%k!=0){
           r=sum%k;
           return r;
             }
       return 0;
           
        
    } 
}