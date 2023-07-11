class Solution {
    public String shiftingLetters(String s, int[] a){  
        int n= a.length;
        String ans= "";
        int x=0;
        for(int i=s.length()-1 ; i>=0 ;i--){
            x=(x+a[i]%26)%26;
            int val= (s.charAt(i)+ x);
            if(val>122) val=val%122 + 96;
            ans= (char) val + ans;
        }  
        return ans;
    }
}
