class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1=strCmp(s);
        String s2=strCmp(t);
        return s1.equals(s2);
    }
    public String strCmp(String s){
        String s1="";
        int c=0;
        for(int i=s.length()-1 ; i>=0 ;i--){
            if(s.charAt(i)=='#') c+=1;
            
            else{
                if(c==0) s1+= s.charAt(i) ;
                else c-=1;
            }
        }
        return s1;
    }
}