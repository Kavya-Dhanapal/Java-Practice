1class Solution {
2    public int[] prevPermOpt1(int[] arr) {
3        int ind=-1;
4
5        for(int i=arr.length-1;i>0;i--){
6            if(arr[i]<arr[i-1]){
7                ind=i-1;
8                break;
9            }
10        }
11            if(ind==-1){
12                return arr;
13            }
14            for(int i=arr.length-1;i>ind;i--){
15                if(arr[i]<arr[ind] && arr[i]!=arr[i-1]){
16                    int temp=arr[i];
17                    arr[i]=arr[ind];
18                    arr[ind]=temp;
19                    break;
20                }
21            }
22        return arr;
23
24    }
25}