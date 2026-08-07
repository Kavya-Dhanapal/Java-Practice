class Solution {

    private boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public int maxVowels(String s, int k) {
        int left = 0;
        int right = 0;
        int vowels = 0;
        int max = 0;

        while (right < s.length()) {

            if (isVowel(s.charAt(right))) {
                vowels++;
            }

            if (right - left + 1 > k) {
                if (isVowel(s.charAt(left))) {
                    vowels--;
                }
                left++;
            }

            if (right - left + 1 == k) {
                max = Math.max(max, vowels);
            }

            right++;
        }

        return max;
    }
}