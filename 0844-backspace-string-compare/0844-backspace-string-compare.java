class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1="";
        String s2="";
        int c=0;
        for(int i=s.length()-1 ; i>=0 ;i--){
            if(s.charAt(i)=='#') c+=1;
            
            else{
                if(c==0) s1+= s.charAt(i) ;
                else c-=1;
            }
            
        }
        c=0;
        for(int i=t.length()-1 ; i>=0 ;i--){
            if(t.charAt(i)=='#') c+=1;
            
            else{
                if(c==0) s2+= t.charAt(i) ;
                else c-=1;
            }
        }
        return s1.equals(s2);
    }
}