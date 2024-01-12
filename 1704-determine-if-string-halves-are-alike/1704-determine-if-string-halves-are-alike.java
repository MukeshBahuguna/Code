class Solution {
    public boolean halvesAreAlike(String s) {
        int c=0 ,c1=0;
        
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int n=s.length();
        
        for(int i=0; i<n/2 ;i++){
            char ch =s.charAt(i);
            char ch1 =s.charAt((n/2) + i);
            if(set.contains(ch)) c+=1;
            if(set.contains(ch1)) c1+=1;
            
        }
        return c==c1;
    }
}