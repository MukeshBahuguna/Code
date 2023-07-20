class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s1= new Stack<>();
        
        int n=a.length;
        int i=0 ;
        
        while(i<n ) {
            if(s1.isEmpty() || a[i]>0 ) s1.push(a[i]);
            else{
                while(!s1.isEmpty() && Math.abs(a[i]) > s1.peek() && s1.peek()>0){
                    s1.pop();
                }
                
                if(!s1.isEmpty() && Math.abs(a[i]) == s1.peek()) s1.pop(); 
                else if(!s1.isEmpty() && s1.peek()<0) s1.push(a[i]);
                else if(s1.isEmpty()) s1.push(a[i]);
                
            }
            i++;
        }
        
        int[] ans = new int[s1.size()];
        i=s1.size()-1;
        while(!s1.isEmpty()){
            ans[i--]=s1.pop();
        }
        
        
        return ans;
    }
}