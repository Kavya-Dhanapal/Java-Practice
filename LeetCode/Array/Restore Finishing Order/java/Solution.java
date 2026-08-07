class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set=new LinkedHashSet<>();
        List<Integer> list=new ArrayList<>();
      
        for(int val:friends){
            set.add(val);
        }
        for(int i:order){
            if(set.contains(i)){
              list.add(i);
            }
        }
          int a[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            a[i]=list.get(i);
        }
         return a;
    }
}