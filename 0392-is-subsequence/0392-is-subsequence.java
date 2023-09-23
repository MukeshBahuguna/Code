class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(int i=0 ; i<t.length() && j<s.length() ; i++){
            char ch= s.charAt(j);
            char ch1= t.charAt(i);
            if(ch==ch1) j+=1;
        }
        
        return j==s.length();
    }
}