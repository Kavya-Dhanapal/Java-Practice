import java.util.*;
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int left=0;
        int sum=0;
        int right=arr.length-1;
           for(int i=left;i<=right;i++){
               sum+=arr[i];
            
           while(sum>target){
               sum-=arr[left];
               left++;
           }
           
           if(sum==target){
               list.add(left+1);
               list.add(i+1);
               return list;
           }
    }
          list.add(-1);
              return list; 
           }
}

