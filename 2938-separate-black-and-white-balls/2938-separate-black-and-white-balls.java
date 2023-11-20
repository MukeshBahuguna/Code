class Solution {
    public long minimumSteps(String s) {
        int n=s.length();
        int i=0 , c=0 ;
        long ans=0;
        while(i<n){
            char ch= s.charAt(i);
            if(ch=='1') c+=1;
            else ans+=c;
            
            i+=1;
        }
        return ans;
    }
}