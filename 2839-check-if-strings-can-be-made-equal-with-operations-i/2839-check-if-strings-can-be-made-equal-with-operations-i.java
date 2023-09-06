class Solution {
    public boolean canBeEqual(String s1, String s2) {
        
        for(int i=0 ; i<4 ;i++){
            char ch=s1.charAt(i);
            char ch1=(i+2>3) ? s2.charAt(i-2) : s2.charAt(i+2) ;
            char ch2 =s2.charAt(i);
            if(ch!=ch1 && ch!=ch2){
                return false;
            }
        }
        
        return true;
    
    }
}