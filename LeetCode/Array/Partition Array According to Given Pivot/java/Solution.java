class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l1=new ArrayList<>();
         List<Integer> l2=new ArrayList<>();
           List<Integer> l3=new ArrayList<>();
         for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                l1.add(nums[i]);
            }
            else if(nums[i]==pivot){
                l2.add(nums[i]);
            }
            else{
                l3.add(nums[i]);
            }
         }
         int arr[]=new int[nums.length];
         
          l1.addAll(l2);
          l1.addAll(l3);
          for(int i=0;i<arr.length;i++){
            arr[i]=l1.get(i);
          }
          return arr;
    }
}