class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> l= new ArrayList<>();
        Map<Integer,Integer> m= new LinkedHashMap<>();
        for (int[] i:nums){
            for(int j:i) {
                m.put(j, m.getOrDefault(j,0)+1);
                if(m.get(j)==nums.length )l.add(j);
            }
        }
        Collections.sort(l); //create an array to prevent sorting
        return l;
    }
}