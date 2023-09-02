class Solution {
    public String convertToTitle(int n) {
        String s="";
        while(n>0){
            int x=n%26==0 ? 26 : n%26;
            s= (char)(64 +x) +s;
            n=(n-1)/26;
        }
        return s;
    }
}
