1class Solution {
2    public boolean areAlmostEqual(String s1, String s2) {
3        if(s1.equals(s2)){
4            return true;
5        }
6          char g[]=s2.toCharArray();
7        for(int i=0;i<s1.length();i++){
8            for(int j=i+1;j<s1.length();j++){
9               char a[]=s1.toCharArray();
10               if(i!=j){
11                char temp=a[i];
12                a[i]=a[j];
13               a[j]=temp;
14                 if(Arrays.equals(a,g)){
15                    return true;
16            }
17                }
18                 System.out.println(new String(a));
19            }
20
21        }
22    return false;
23    }
24}