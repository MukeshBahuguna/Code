class Solution {
    public String customSortString(String X, String Y) {
        int[] charCount = new int[26];
        for(char c : Y.toCharArray()){
            charCount[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        //first store char in same order of String X
        for(char c : X.toCharArray()){
            while(charCount[c - 'a'] --> 0){
                sb.append(c);
            }
        }
        
        //now store remaining char of string Y
        for(int i = 0; i < 26; i++){
            char c = (char)('a' + i);
            while(charCount[i] --> 0){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}