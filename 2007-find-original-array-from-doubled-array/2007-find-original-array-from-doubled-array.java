class Solution {
    public int[] findOriginalArray(int[] c) {
        int n= c.length;
        if(n%2!=0) return new int[0];
        
        int[] a=new int[n/2]; 
        Arrays.sort(c); 
        Map<Integer,Integer> m =new HashMap<>();
        
        for (int i:c)
            m.put(i , m.getOrDefault(i,0)+1);
        
        int j=0;
        for (int i=0; i<n ;i++){
            int x= c[i]*2;
            if(c[i]!=0){
                if (m.containsKey(x) && m.get(c[i])>0 && m.get(x)>0){
                    a[j++]=c[i];
                    m.put(c[i], m.get(c[i])-1);
                    m.put(x, m.get(x)-1);
                }
            }
            else{
                if(m.get(c[i])<=1) continue; 
                else {
                    a[j++]=c[i];
                    m.put(c[i], m.get(c[i])-1);
                    m.put(x, m.get(x)-1);
                }
            }
        }
        // System.out.println(Arrays.toString(a)+j);
        return j==n/2 ? a : new int[0];
        
    }
}