class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> com=new ArrayList<>();
        sub(0,candidates,target,new ArrayList<>());
        return list;
    }
    public void sub(int index,int candidates[],int target,List<Integer> temp){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            temp.add(candidates[i]);
            sub(i,candidates,target-candidates[i],temp);
            temp.remove(temp.size()-1);
        }
    }
}