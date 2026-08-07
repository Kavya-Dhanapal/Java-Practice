class Solution {
    public long gcdSum(int[] nums) {
      int max=nums[0];
      long a[]=new long[nums.length];
      for(int i=0;i<nums.length;i++){
          max=Math.max(nums[i],max);
          if(max==nums[i]){
            a[i]=max;
          }
          else{
          a[i]=call(nums[i],max);
          }
      }
      Arrays.sort(a);
      int left=0;
      int right=nums.length-1;
      long sum=0;
    while(left<right){
        long d=call(a[left],a[right]);
        sum=sum+d;
        left++;
        right--;
   
    }
    return sum;
    }
   public long call(long a,long b){

    while(b!=0){

        long temp=b;
        b=a%b;
        a=temp;
    }

    return a;
}
    
}