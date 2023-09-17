class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0 ;i<nums.size() ;i++){
            if(setBits(i)==k) sum+=nums.get(i);
        }
        return sum;
    }
    
    public int setBits(int x){
        int c=0;
        for(int i=0 ; i<32 ;i++){
            if((x & (1<<i))!=0) c+=1;
        }
        return c;
    }
}