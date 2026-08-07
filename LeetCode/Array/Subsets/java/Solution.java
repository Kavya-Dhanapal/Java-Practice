class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> list=new ArrayList<>();
      sub(nums,0,list,new ArrayList<>());
      return list; 
    }
    public static void sub(int nums[], int index,List<List<Integer>> list,List<Integer> temp){
        if(index==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        sub(nums,index+1,list,temp);
        temp.remove(temp.size()-1);
        sub(nums,index+1,list,temp);
    }
}