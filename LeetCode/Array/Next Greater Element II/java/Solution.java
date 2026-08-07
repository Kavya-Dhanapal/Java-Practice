class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[]=new int[nums.length];
        Arrays.fill(arr,-1);
        Stack<Integer> stack=new Stack<>();
        int k=0;
       /* while(k<2){
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]< nums[i]){
                arr[stack.pop()]= nums[i];
            }
            stack.push(i);
        }
        k++;
        }*/
        int j=0;
        for(int i=0;i<nums.length*2;i++){
             j=i%nums.length;
            while(!stack.isEmpty() && nums[stack.peek()]< nums[j]){
                arr[stack.pop()]= nums[j];
            }
            
            stack.push(j);
        }
        return arr;
    }
}