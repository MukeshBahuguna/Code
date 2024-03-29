class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i=0 ,j=0 , k=0 ,l=0;
        while(i<word1.length && k<word2.length) {
            if( word1[i].charAt(j)==word2[k].charAt(l)){
                j+=1;
                l+=1;
            }  
            else return false;
              
            if(j>=word1[i].length()){
                i+=1;
                j=0;
            }
            if(l>=word2[k].length()) {
                k+=1;
                l=0;
            }
            
        }
        if(i<word1.length || k<word2.length) return false;
        return true;
    }
}