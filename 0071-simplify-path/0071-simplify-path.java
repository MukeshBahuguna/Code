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
            ans= (ans.length()==0 ? ss : ss +"/")+ans;
        }
        return  "/"+ ans;
    }
}