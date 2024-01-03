class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n =nums.length;
        Map<Integer , Integer> m = new HashMap<>();
        
        List<List<Integer>> l =new ArrayList<>();
        int max=0;
        for(int i=0 ;i<n ;i++){
            m.put(nums[i] , m.getOrDefault(nums[i],0)+1);
            max=Math.max(max ,m.get(nums[i]));
        }
        
        for(int i=0 ;i<max ;i++) l.add(new ArrayList<>());
        
        for(int j : m.keySet()){
            for(int i=0 ;i<l.size() ;i++){
                if(m.get(j)!=0){
                    l.get(i).add(j);
                    m.put(j , m.get(j)-1);
                }
            } 
        }
        return l;
    }
}