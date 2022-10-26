class Solution {
    public boolean checkSubarraySum(int[] a, int k) {
        Map<Integer,Integer> m= new HashMap<>();
        m.put(0,-1);
        int s=0,c=0;
        for(int i=0 ; i<a.length ;i++){
            s+=a[i];
            if (k!=0) s=s%k;
            
            if (m.containsKey(s)){
                if  (i-m.get(s) > 1){
                    return true;
                }
            }
            else
                m.put(s , i);
        }
        return false;
    }
}