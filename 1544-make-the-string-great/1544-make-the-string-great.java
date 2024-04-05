class Solution {
    public String makeGood(String s) {
        Stack<Character> stack= new Stack<>();
        int n=s.length();
        int i=0;
        while(i<n){
            char ch =s.charAt(i);
            if(stack.isEmpty()) stack.push(ch);
            else if(!stack.isEmpty() && Character.toLowerCase(stack.peek())==Character.toLowerCase(ch) && stack.peek()!=ch ){
                stack.pop();
            }
            else stack.push(ch);
            i+=1;
        }
        String ans="";
        while(!stack.isEmpty()) ans=stack.pop()+ans;
        
        return ans; 
    }
}