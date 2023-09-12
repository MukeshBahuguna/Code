class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int ans=0;
        Collections.sort(nums , (x,y) -> x.get(0)-y.get(0)==0 ? x.get(1)-y.get(1) : x.get(0)-y.get(0) );
        ans=nums.get(0).get(1) - nums.get(0).get(0)+1; 
        int temp = nums.get(0).get(1)+1; 
        for(int i=1 ; i<nums.size() ;i++){
            if(temp >= nums.get(i).get(0)){
                int c=nums.get(i).get(1) - temp +1 ;
                ans+=c>0 ? c :0; 
            }
            else ans+=nums.get(i).get(1) - nums.get(i).get(0) +1 ;
            
            temp=Math.max(temp , nums.get(i).get(1) +1); 
        }
        return ans;
    }
}