class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> m= new HashMap<>();
        int n=nums.length;
        for(int i=0; i<n; i++) m.put(nums[i] , m.getOrDefault(nums[i],0)+1 );
        
        int c=0;
        for(int i: m.keySet()){
            if(m.get(i)<2) return -1;
            else{
                c+=m.get(i)/3;
                int x= m.get(i)%3;
                if(x!=0) c+= 1;
            }
        }
        return c;
        
    }
}