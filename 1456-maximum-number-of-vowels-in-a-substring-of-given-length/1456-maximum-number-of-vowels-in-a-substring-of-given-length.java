class Solution {
    public int maxVowels(String s, int k) {
        int end = 0;
        int max = 0;
        int vowels = 0;

        while(end < s.length()) {
            if(isVowel(s.charAt(end))) vowels+=1;
            if(end >= k && isVowel(s.charAt(end-k))) vowels -= 1;
            max = Math.max(vowels, max);
            if(max == k) break;
            end++;
        }
        return max;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}