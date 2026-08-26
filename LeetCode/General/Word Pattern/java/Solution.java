1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3       HashMap<Character,String> map=new HashMap<>();
4       String arr[]=s.trim().split(" ");
5       if (pattern.length() != arr.length) return false;
6        for (int i = 0; i < pattern.length(); i++) {
7            char ch = pattern.charAt(i);
8            if (map.containsKey(ch)) {
9                if (!map.get(ch).equals(arr[i])) {
10                    return false;
11                }
12            }
13            else {
14                if (map.containsValue(arr[i])) 
15                    return false;
16
17                map.put(ch, arr[i]);
18            }
19        }
20      return true;
21    }
22}