class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] a =new int[26];
        int ans=0;
        for(int i=0 ; i< chars.length() ; i++){
            char ch =chars.charAt(i);
            a[ch-97]+=1;
        }
        for(int i=0 ; i< words.length ; i++){
            String str =words[i];
            int[] aNew =new int[26];
            for(int j=0 ; j< str.length() ; j++){
                char ch =str.charAt(j);
                aNew[ch-97]+=1;
            } 
            int valid=0;
            for(int j=0 ; j<26 ; j++){
                if(aNew[j]!=0 && aNew[j]>a[j]) {
                    valid=1;
                    break;
                }
            }
            if(valid==0) ans+=str.length();
        }
        
        return ans;
        
    }
}