class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> l1=new ArrayList<>();
          List<Integer> l2=new ArrayList<>();
          for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                l1.add(nums[i]);
            }
            else{
                l2.add(nums[i]);
            }
          }
          int i=0;int j=0;
         while(i<nums.length){
            nums[i++]=l1.get(j);
            nums[i++]=l2.get(j);
            j++;
            }
          return nums;
    }
}