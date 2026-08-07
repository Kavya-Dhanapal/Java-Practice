class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double max=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        int count=0;
        while(right<nums.length){
             sum+=nums[right];
              count++;
             right++;
            if(count==k){
                 max=Math.max(sum,max);
                sum-=nums[left];
                count--;
                left++;
              
            }
            
           
        }
        return max/k;
    }
}