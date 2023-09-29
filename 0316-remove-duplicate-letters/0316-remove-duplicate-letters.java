class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack= new Stack<>();
        
        int[] a = new int[26];        
        int n=s.length() , c=0;

        String ans="";
        for(int i=0; i<n ;i++){
            char ch =s.charAt(i);
            a[ch-97]+=1;   
        }
        int[] arr= new int[26];
        for(int i=0; i<n ;i++){
            char ch =s.charAt(i);
            if(arr[ch-97]!=1){
                while(!stack.isEmpty() && stack.peek()>=ch && (a[stack.peek()-97]-1)>0 ){
                    a[stack.peek()-97]-=1;
                    arr[stack.peek()-97]=0;
                    stack.pop();

                }
                stack.push(ch);
                arr[ch-97]=1;
            } 
            else a[ch-97]-=1;
        }
        
        while(!stack.isEmpty()) ans=stack.pop()+ans;
        return ans;
    }
}