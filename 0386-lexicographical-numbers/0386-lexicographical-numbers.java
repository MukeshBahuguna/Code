class Solution {
    List<Integer> l = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        f(n,1,10, 1);
        return l;
    }
    public void f(int n, int i ,int c ,int val) {
        if(val>n) return ;
        if(l.size()>=n) return;
        if(val%10==0 && c==0) return ;
        
        l.add(val);
        f(n ,i, 1, val*10);
        f(n,i+1 ,0, val+1);
    }
    
    

}