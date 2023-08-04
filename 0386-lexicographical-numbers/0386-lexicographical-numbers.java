class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l = new ArrayList<>();
        for(int i=1 ; i<=n ;i++) l.add(i);
        
        Collections.sort(l ,  (a,b) -> String.valueOf(a).compareTo(String.valueOf(b)));
        return l;
    }

}