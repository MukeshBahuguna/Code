class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1){return s;}
        
        String[][] dp = new String[s.length()][s.length()];
        return util(s,0,s.length() - 1,dp);
    }
    
    String util(String s,int start,int end,String[][] dp){
        if(start > end){return "";}
        if(dp[start][end] != null){return dp[start][end];}

        if(s.charAt(start) == s.charAt(end) && isPalindrome(s,start + 1,end - 1)){
            return s.substring(start, end + 1);
        }

        String right = util(s,start + 1,end,dp);
        String left = util(s,start,end - 1,dp);
        
        return dp[start][end] = right.length() > left.length()?right:left;
    }
    
    boolean isPalindrome(String s,int start,int end){
        while(start < end){
            if(s.charAt(start++) != s.charAt(end--)){return false;}
        }
        return true;
    }
}