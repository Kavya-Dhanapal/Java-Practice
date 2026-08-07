import java.util.*;

class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        int n = word.length();
        int i = 0;
        
        while (i < n) {
            if (!Character.isDigit(word.charAt(i))) {
                i++;
                continue;
            }
            
            int j = i;
            while (j < n && Character.isDigit(word.charAt(j))) {
                j++;
            }
            
            String num = word.substring(i, j);
            num = num.replaceFirst("^0+", "");
            
            if (num.equals("")) {
                num = "0";
            }
            
            set.add(num);
            i = j;
        }
        
        return set.size();
    }
}