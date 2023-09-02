class Solution {
    public String replaceDigits(String s) {
        int n =s.length();
        String ans= "";
        for(int i=0 ; i<n ;i++){
            if(i%2!=0){
                ans+= ((char)(s.charAt(i-1)+ s.charAt(i)-'0'));
            }
            else ans+=s.charAt(i);
        }
       return ans; 
    }
}