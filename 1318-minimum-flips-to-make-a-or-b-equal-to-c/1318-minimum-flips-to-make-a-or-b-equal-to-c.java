class Solution {
    public int minFlips(int a, int b, int c) {
        int cnt=0;
        for(int i=0  ; i<=31 ; i++){
            if((a%2 | b%2) != c%2){
                if(a%2!=c%2 && b%2!=c%2 && (a%2 & b%2) ==1) cnt+=2;
                else cnt+=1;
            }
            
            a/=2;
            b/=2;
            c/=2;
        }
        return cnt;
    }
}