class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int i=0;
        int n=Math.min( Math.min(s1.length() , s2.length()) , s3.length()) ;
        int c=0 ,ans=0;
        while(i<n){
            if(s1.charAt(i)== s2.charAt(i) && s1.charAt(i)==s3.charAt(i)) c+=1;
            else break;
            i+=1;
        }
        ans+= c==0 ? -1 : ( s1.length()-c + s2.length()-c + s3.length()-c  );
        return ans;
    }
}