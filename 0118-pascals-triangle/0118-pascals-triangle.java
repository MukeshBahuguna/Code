class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> l= new ArrayList<List<Integer>>();
        List<Integer> s=new ArrayList<Integer>();
        
        for( int i=0; i<n;i++){
            s.add(1);
            int ll=s.size();
            for (int j=ll-2; j>0;  j--){ s.set(j , s.get(j)+s.get(j-1)); }
            l.add(new ArrayList<>(s));
        }
        return l;
    }
}