class Solution {
    public int majorityElement(int[] nums) {
        int e1=Integer.MAX_VALUE,c1=0 ;
        int n=nums.length;
        for(int i=0 ;i<n ;i++){
            if(e1==nums[i]) c1+=1;
            
            else if(c1==0){
                e1=nums[i];
                c1=1;
            } 
            else c1--;
        }
        
        //count majority
        // c1=0;
        // for(int i=0 ;i<n ;i++){
        //     if(e1==nums[i]) c1+=1;
        // }
        
        return e1;
    }
}