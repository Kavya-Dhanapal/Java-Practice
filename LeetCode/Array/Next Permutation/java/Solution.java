class Solution {
    public void nextPermutation(int[] nums) {
        int piv=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                piv=i;
                break;
            }
        }
        if(piv==-1){
            reverse(nums,0);
            return;
        }
        for(int i=nums.length-1;i>piv;i--){
            if(nums[i]>nums[piv]){
            int temp=nums[piv];
             nums[piv]=nums[i];
            nums[i]=temp;
            break;
            }
        }
        reverse(nums,piv+1);
    }
    public static int[] reverse(int nums[],int start){
        int end=nums.length-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
            }
}