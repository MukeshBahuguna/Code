class Solution {
    public int[] findErrorNums(int[] nums) {
        int a=0;
        int b=0;
        int n=nums.length;
        int x= (n * (n+1)) /2 ;
        int s=0;
        Set<Integer> set =new HashSet<>();
        
        for(int i:nums) {
            if(set.contains(i)) b=i;
            s+=i; 
            set.add(i);
        }
        if(s>x) a= b - (s-x);
        else a= b + (x-s);
        
        return new int[] {b,a};
    }
}