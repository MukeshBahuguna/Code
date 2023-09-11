class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n=s1.length();
        Map<Character , int[]> m = new HashMap<>();
        for(int i=0 ; i<n ;i++){
            char ch = s1.charAt(i);
            
            if(m.containsKey(ch)){
                m.get(ch)[i%2]+=1;
            }
            else{
                int[] arr =new int[2];
                arr[i%2]+=1;
                m.put(ch , arr);
            }
        }
         
        for(int i=0 ; i<n ;i++){
            char ch=s2.charAt(i);
            if(m.containsKey(ch) &&  m.get(ch)[i%2]>0) m.get(ch)[i%2]-=1;
            else return false;
        }
        
        return true;
    }
}