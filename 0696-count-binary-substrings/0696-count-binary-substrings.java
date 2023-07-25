class Solution {
    public int countBinarySubstrings(String s) {
        int ans=0 ,i=0 ,j=0,prev=0;
        int n= s.length();
        while(i<n && j<n){
            prev=i;
            char c1= s.charAt(i); 
            while(i<n && s.charAt(i) == c1) i++;
            
            if(i>=n) return ans;
            
            j=i; 
            char c2= s.charAt(j);
            while(j<n && s.charAt(j) == c2) j++; 
            
            ans+=Math.min(i-prev , j-i);
  
        }
        return ans;
    }
}