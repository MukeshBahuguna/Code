class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> l = new ArrayList();
        List<Integer> x = new ArrayList();
        x.add(0);
        dfsHelper(graph, 0 , l,x);
        return l;
    }
    
    public void dfsHelper(int[][] graph, int s, List<List<Integer>> l ,List<Integer> x ){

        if(s==graph.length-1){
            l.add(new ArrayList(x));
            return;
        }
        
        for(int j : graph[s]){
            x.add(j);
            dfsHelper(graph , j ,l , x);
            x.remove(x.size()-1);
        }
    }
}