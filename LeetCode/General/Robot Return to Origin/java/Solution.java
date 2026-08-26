1class Solution {
2    public boolean judgeCircle(String moves) {
3       int j=0;
4       int i=0;
5       for(char c:moves.toCharArray()){
6        if(c=='U'){
7            i++;
8        }
9        else if (c=='D'){
10            i--;
11        }
12        else if (c=='R'){
13            j++;
14        }
15        else if(c=='L'){
16            j--;
17        }
18       } 
19       if(i==0 && j==0){
20        return true;
21       }
22       return false;
23    }
24}