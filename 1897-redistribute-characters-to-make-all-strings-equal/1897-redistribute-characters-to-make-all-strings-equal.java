class Solution {
    public boolean makeEqual(String[] words) {
        int[] a = new int[26];
        int n=words.length;
        
        for(int i=0; i<n ;i++){
            String s = words[i];
            for(int j=0; j<s.length() ; j++){
                char ch= s.charAt(j);
                a[ch-97]+=1;
            }
        }
        for(int i=0; i<a.length;i++){
            if(a[i]%n!=0) return false;
        }
        return true;
    }
}