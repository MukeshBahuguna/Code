class Solution {
    public int minChanges(String s) {
        int n=s.length();
        int c=0;
        for(int i=0 ; i<n-1 ;i+=2){
            char ch =s.charAt(i);
            char ch1 =s.charAt(i+1);
            
            if(ch!=ch1){
                c+=1;
            }
        }
        return c;
    }
}