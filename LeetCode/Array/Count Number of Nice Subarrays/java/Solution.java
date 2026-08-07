class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        int v=0;
        int odd=0;
        int j=0;
         for(int i=0;i<nums.length;i++){
        if(nums[i]%2!=0){
            odd++;
            v=0;
             }
             while(odd==k){
                v++;
                if(nums[j]%2!=0){
                    odd--;
                }
                j++;
             }
       count=count+v;
       }
       return count;
    }
}