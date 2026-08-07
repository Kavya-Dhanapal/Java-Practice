class Solution {
    public int[] singleNumber(int[] nums) {
     int a[]=new int[2];
     int k=0;
        for(int i=0;i<nums.length;i++){
             boolean s=false;
            for(int j=0;j<nums.length;j++){
            if(i!=j&& nums[i]==nums[j]){
                s=true;
            }
            }
            if(s==false){
              a[k]=nums[i];
              k++;
            }
        }
        return a;
    }
}
    