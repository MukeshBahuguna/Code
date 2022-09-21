class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] q) {
        int n=q.length;
        int j=0;
        int e=0 ;
        int[] a= new int[nums.length];
        for(int i:nums)
            if(i%2==0) e+=i;
        
        for(int i=0;  i<n; i++){
            if(nums[q[i][1]]%2==0){
                if((nums[q[i][1]]+q[i][0]) % 2==0){
                    e-=nums[q[i][1]];
                    e+=nums[q[i][1]]+q[i][0];
                }
                else e-=nums[q[i][1]];
            }
            else
                if((nums[q[i][1]]+q[i][0])%2==0) e+=(nums[q[i][1]]+q[i][0]);
            
            nums[q[i][1]]+=q[i][0];
            
            // System.out.println(Arrays.toString(nums));
            a[j++]=e;
        }
        return a;
    }
}