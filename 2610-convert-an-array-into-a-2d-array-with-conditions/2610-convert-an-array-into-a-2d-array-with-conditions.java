class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n =nums.length;
        int[] a =new int[n+1];
        
        List<List<Integer>> l =new ArrayList<>();
        int max=0;
        for(int i=0 ;i<n ;i++){
            a[nums[i]]+=1;
            max=Math.max(max ,a[nums[i]]);
        }
        
        for(int i=0 ;i<max ;i++) l.add(new ArrayList<>());
        
        int c=0;
        for(int i=0 ;i<l.size() ;i++){
            for(int j=0 ; j<n+1  ;j++){
                if(a[j]!=0){
                    l.get(i).add(j);
                    a[j]-=1;
                }
                else c+=1;
            } 
            if(c==a.length) break;
        }
        return l;
    }
}