class Solution {
    public String reversePrefix(String word, char ch) {
        String s="";
        int flag=0;
        int n=word.length();
        for (int i=0 ; i<n ;i++){
            char c = word.charAt(i);
            s=c+s;
            if(c==ch) {
                flag=1;
                break;
            }
        }
        return flag==0 ? word : s+word.substring(s.length(), n);
    }
}