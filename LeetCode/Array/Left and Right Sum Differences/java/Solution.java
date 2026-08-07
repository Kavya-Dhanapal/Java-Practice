class Solution {
    public int[] leftRightDifference(int[] nums) {
        int arr[]=new int[nums.length];
        int arr1[]=new int [nums.length];
         int ans[]=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i+1;j<nums.length;j++){
                  sum=sum+nums[j]; 
            }
            arr[i]=sum;
        }
        int k=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<i;j++){
                sum=sum+nums[j];
               }
            arr1[k]=sum;
            k++;
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=Math.abs(arr[i]-arr1[i]);
        }
        return ans;
    }
}