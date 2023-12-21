class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int t=3 , n =nums.length;
        int c=0;
        int[][] a= new int[n/t][t];
        for(int i=0 ; i<n ;i+=t){
            int j=i ,temp=0;
            while(temp<t){
                if(nums[j]-nums[i]> k) return new int[0][0];
                else a[c][j%t]= nums[j];
                j+=1;
                temp+=1;
            }
            c+=1;
        }
        return a;
    }
}