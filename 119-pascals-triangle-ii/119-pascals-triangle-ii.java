class Solution {
    public List<Integer> getRow(int n) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0; i<=n ;i++){
            List<Integer> x  =new ArrayList<>();
            x.add(1);
            for(int j=1 ; i-1>0 && j<l.get(i-1).size() ;j++){
                x.add(l.get(i-1).get(j) + l.get(i-1).get(j-1));
            }                
            if(i!=0) x.add(1);
            l.add(x);
        }
        return l.get(n);
    }
}