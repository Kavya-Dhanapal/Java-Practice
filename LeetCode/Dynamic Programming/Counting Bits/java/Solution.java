class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
        int i=1;
    for(i=1;i<=n;i++){
        a[i]=a[i>>1]+(i&1);

    }
    return a;
    }
}