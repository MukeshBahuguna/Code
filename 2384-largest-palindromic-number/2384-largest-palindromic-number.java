class Solution {
    public String largestPalindromic(String num) {
        int[] a =new int[10];
        
        for(int v : num.toCharArray()){
            a[v - '0']++;
        }
        StringBuffer str1 = new StringBuffer();
        int max = -1;
        for(int i = 9; i >= 0; i--){
            if(a[i] % 2 == 1){
                max = Math.max(max, i);
            }
            for(int j = 0; j < a[i] / 2; j++){
                str1.append(i);
            }
        }
        
        String ans= str1.toString() + (max==-1 ? "" : max) + str1.reverse().toString(); 
        
        if(ans.charAt(0)=='0'){
            if(max==-1) return "0";
            else {
                return ""+max;
            }
        }
        return ans;  
    }
}