class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l =new ArrayList<>();
        int e1=Integer.MAX_VALUE, e2=Integer.MIN_VALUE ,c1=0 ,c2=0;
        int n=nums.length;
        
        for(int i=0 ;i<n ;i++){
            if(e1==nums[i]) c1+=1;
            else if(e2==nums[i]) c2+=1;
            else if(c1==0){
                e1=nums[i];
                c1=1;
            } 
            else if(c2==0){
                e2=nums[i];
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0 ;i<n ;i++){
            if(e1==nums[i]) c1+=1;
            else if(e2==nums[i]) c2+=1;
        }
        if(c1>n/3) l.add(e1);
        if(e1!=e2 && c2>n/3) l.add(e2);
        return l;
        
    }
}