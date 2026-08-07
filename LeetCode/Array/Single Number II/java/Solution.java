class Solution {
    public int singleNumber(int[] nums) {
       
        for(int i=0;i<nums.length;i++){
             boolean s=false;
            for(int j=0;j<nums.length;j++){
            if(i!=j&& nums[i]==nums[j]){
                s=true;
            }
            }
            if(s==false){
                return nums[i];
            }
        }
        return -1;
    }
}