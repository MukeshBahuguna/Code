class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' ') i--;
        for(; i>=0 ;i--){
            char ch = s.charAt(i);
            if(ch!=' ') ans+=1;
            else break;
        }
        return ans;
    }
}