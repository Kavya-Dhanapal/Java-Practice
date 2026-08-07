class Solution {
    public int maxFreqSum(String s) {
    int freq[]=new int[26];
    
    int max=0;
    int max1=0;
    for(char c:s.toCharArray()){
        freq[c-'a']++;
        if(isVowel(c)){
           max=Math.max(max,freq[c-'a']);
        }
        else{
          max1=Math.max(max1,freq[c-'a']);
        }
    }
    /*for(int i=0;i<freq.length;i++){
        if(freq[i]>max){
            max=freq[i];
        }
    } for(int i=0;i<freq1.length;i++){
        if(freq1[i]>max){
            max1=freq1[i];;
        }
    }*/
    return max+max1;
    }
        public boolean isVowel(char a){
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                return true;
            }
            return false;
        }
        
    }
