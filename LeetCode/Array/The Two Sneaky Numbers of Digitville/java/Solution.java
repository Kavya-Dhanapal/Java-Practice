class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
         HashSet<Integer> set1=new HashSet<>();
         Arrays.sort(nums);
        for(int val:nums){
           if(set.contains(val)){
            set1.add(val);
           }
           else{
            set.add(val);
           }
        }
        
        int a[]=new int[set1.size()];
        int i=0;
               for(int val:set1){
                a[i]=val;
                 i++;
               }
        
       return a;
    }
}