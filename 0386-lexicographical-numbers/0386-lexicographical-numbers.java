class Solution {
    List<Integer> l = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        f(n,1,true, 1);
        return l;
    }
    public void f(int n, int i ,boolean flag ,int val) {
        if(val>n) return ;
        if(l.size()>=n) return;
        if(val%10==0 && !flag) return ;
        
        l.add(val);
        f(n ,i, true, val*10);
        f(n,i+1 ,false, val+1);
    }
    
    

}