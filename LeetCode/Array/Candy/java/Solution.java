public class Solution {
    public int candy(int[] ratings) {
       int a1[]=new int[ratings.length];
       int a2[]=new int[ratings.length];
       a1[0]=1;
       for(int i=1;i<ratings.length;i++){
        if(ratings[i]>ratings[i-1]){
            a1[i]=a1[i-1]+1;
        }
        else{
            a1[i]=1;
        }
       }
       a2[ratings.length-1]=1;
       for(int i=ratings.length-2;i>=0;i--){
        if(ratings[i]>ratings[i+1]){
            a2[i]=a2[i+1]+1;
        }
        else{
            a2[i]=1;
        }
       }
       int sum=0;
       for(int i=0;i<ratings.length;i++){
          sum+=Math.max(a1[i],a2[i]);
       }
       
       return sum;
    }
}