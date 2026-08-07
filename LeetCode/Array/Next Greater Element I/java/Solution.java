class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                 nums1[i]=call(j,nums2);
                 break;
                }
            }
        }
        return nums1;
    } 
    public static int call(int j,int nums2[]){
      for(int k=j+1;k<nums2.length;k++){
            if(nums2[j]<nums2[k]){
                return nums2[k];
             }
          }
              return -1;
    }
}