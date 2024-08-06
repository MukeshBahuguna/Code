class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n= graph.length;
        
        List<List<Integer>> l = new ArrayList();
        List<Integer> x = new ArrayList();
        
        dfsHelper(graph, 0, n , l,x);
        return l;
    }
    
    public void dfsHelper(int[][] graph, int s, int n, List<List<Integer>> l ,List<Integer> x ){
        x.add(s);
        
        for(int j=0 ; j< graph[s].length ; j++){
            int ele= graph[s][j];
            if(ele==n-1){
                x.add(ele);
                l.add(new ArrayList(x));   
                x.remove(x.size()-1);
            }
            else  {
                dfsHelper(graph , ele , n , l , x);
                x.remove(x.size()-1);
            }
        }
    }
}