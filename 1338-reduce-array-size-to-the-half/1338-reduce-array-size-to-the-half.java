class Solution {
    public int minSetSize(int[] arr) {
        int n=arr.length;
        List<Integer> a= new ArrayList<>();
        Map<Integer,Integer> m= new HashMap<>();
        
        for (int i=0; i<n ;i++)
            m.put(arr[i] , m.getOrDefault(arr[i],0)+1);
        
        for(int i:m.keySet())
            a.add(m.get(i));
        
        Collections.sort(a,(x,y)-> y-x);
        int c=0 ,ans=0;
        for (int i:a){
            c+=i;
            ans+=1;
            if (c>=n/2) break;
        }
        return ans;
    }
}