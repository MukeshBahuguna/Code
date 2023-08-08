class Solution {
    public String finalString(String s) {
        int n =s.length();
        StringBuilder str=new StringBuilder();
        int i=0;
        
        while(i<n){
            if(s.charAt(i) == 'i'){
                str.reverse();
            }
            else {
                str.append(s.charAt(i));
            }
            i+=1;
            
        }
       
        return new String(str);
    }
}