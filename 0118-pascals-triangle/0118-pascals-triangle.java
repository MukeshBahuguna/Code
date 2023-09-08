class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> l= new ArrayList<List<Integer>>();
        List<Integer> s=new ArrayList<Integer>();
        
        for( int i=0; i<n;i++){
            s.add(0,1);
            int ll=s.size();
            for (int j=1; j<ll-1;  j++){
                s.set(j , s.get(j)+s.get(j+1));
            } 
            
            l.add(new ArrayList<>(s));
        }
        
        return l;
    }
}