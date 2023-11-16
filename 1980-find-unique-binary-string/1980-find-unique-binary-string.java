class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set= new HashSet<>();
        int n=nums.length;
        f(n , "" ,set);
        String ans= "";
        for(int i=0 ; i<n ;i++){
            if(set.contains(nums[i]))  set.remove(nums[i]);
        }
        for(String x : set){
            ans=x;
            break;
        }
        return ans;
        
    }
    public void f(int n , String s, Set<String> set) {
        if(s.length()==n){
           set.add(new String(s)); 
           return;
        }
        
        f(n, s+"0" ,set);
        f(n, s+"1", set);
        
    }
}