class Solution {
    public String simplifyPath(String path) {
        Stack<String> s =new Stack<>();
        String ans="";
        String[] a = path.split("/");
        int n= a.length;
        
        for(int i=1 ;i <n ;i++){
            String x= a[i];
            if(x.equals("..")) {
                if(!s.isEmpty()) s.pop();
                continue;
            }
            else if(x.equals(".") || x.equals("")) continue;
            s.push(x);
        }
        while(!s.isEmpty()){
            String ss=s.pop();
            ans= ss+ "/" +ans;
        }
        return ans.length() >0 ? "/"+ ans.substring(0,ans.length()-1) : "/";
    }
}