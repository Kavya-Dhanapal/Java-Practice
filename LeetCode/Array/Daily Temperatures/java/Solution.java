class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> stack=new Stack<>();
    int arr[]=new int[temperatures.length];
   
    for(int i=0;i<arr.length;i++){
      
        while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
             int j=stack.peek();
             arr[stack.pop()]=i-j;
        }
        stack.push(i);
    }
     return arr;
    }
}