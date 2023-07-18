class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        
      return helper(a,b) || helper (b,a);
    }
    public boolean helper(String a , String b){
        int n=a.length();
        int i=0 , j=n-1;
        while(i<j) {
            if(a.charAt(i)!=b.charAt(j)) break;
            i+=1;
            j-=1;
        }

        return check(a,i,j) || check(b,i,j);
    }
     public boolean check(String a , int i ,int j){
        while(i<j) {
            if(a.charAt(i)!=a.charAt(j)) return false;
            i+=1;
            j-=1;
        }

        return true;
    }
}