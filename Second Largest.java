class SecondLargest {
    public int getSecondLargest(int[] arr) {
        // code here
        int lar=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>lar ){
                    sec=lar;
                    lar=arr[i];
                    
                }
                else if(arr[i]>sec && arr[i]!=lar){
                    sec=arr[i];
                }
            }
    
            if(sec==Integer.MIN_VALUE){
                return -1;
            }
            return sec;
        
    }
}