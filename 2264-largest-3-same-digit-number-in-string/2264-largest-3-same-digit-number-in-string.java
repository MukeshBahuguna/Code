class Solution {
    public String largestGoodInteger(String num) {
        int n= num.length();
        int i=0 ,k=3;
        String ans="" ,temp="";
        while(i<n){
            if(temp.length()==k){
                if(ans.length()==0 ) ans=temp;
                else if(ans.compareTo(temp)<0){
                    ans=temp;
                    temp=new String();
                }
            }
            
            if(temp.length() > 0 && temp.charAt(temp.length()-1) != num.charAt(i)) temp=new String();
            temp+=num.charAt(i);
            i+=1;  
        }
        if(temp.length()==k && ans.compareTo(temp)<0)ans=temp;
        return ans;
    }
}