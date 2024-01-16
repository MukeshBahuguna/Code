class Solution {
    public List<List<Integer>> findWinners(int[][] arr){
        Map<Integer,Integer>  m = new TreeMap<>();
        Map<Integer,Integer>  m1 = new TreeMap<>();
        
        int n=arr.length;
        
        List<List<Integer>> l = new ArrayList<>();
        l.add(new ArrayList<>());
        l.add(new ArrayList<>());
        
        for(int i=0;i<n;i++){
            m.put(arr[i][1],  m.getOrDefault(arr[i][1], 0)+1);
            m1.put(arr[i][0],  m.getOrDefault(arr[i][0], 0)+1);
        } 
        
        for(int i: m.keySet()) if(m.get(i)==1) l.get(1).add(i); 
        for(int i: m1.keySet()) if(!m.containsKey(i)) l.get(0).add(i); 
        
        return l;
    }
}