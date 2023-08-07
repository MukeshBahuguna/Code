class Solution {
    List<Integer> l = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        f(n,1);
        return l;
    }
    public void f(int n, int val ) {
        if(val > n)
            return;
        
        l.add(val);
        f(n, val * 10);
        if(val % 10 != 9) f(n, val + 1);
    }
    
    

}