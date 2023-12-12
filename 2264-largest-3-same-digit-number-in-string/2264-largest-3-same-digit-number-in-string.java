class Solution {
    public String largestGoodInteger(String num) {
        int n= num.length();
        int i=0 ,k=3;
        String ans="";
        String temp="";
        while(i<n){
            if(temp.length()==k){
                if(ans.length()==0 ) ans=new String(temp);
                else if(ans.compareTo(temp)<0){
                    ans=new String(temp);
                    temp="";
                }
            }
            
            if(temp.length() > 0 && temp.charAt(temp.length()-1) != num.charAt(i)) temp=new String();
            temp+=num.charAt(i);
            i+=1;  
        }
        if(temp.length()==k && ans.compareTo(temp)<0) ans=new String(temp);
        return ans;
    }
}