class Solution {
    public int longestPalindrome(String[] words) {
        int ans=0;
        int n=words.length;
        
        Map<String,Integer> map= new HashMap<>();
        Map<String,Integer> map1= new HashMap<>();
        int max=0;
        
        for (int i=0 ;i<n ;i++){
            if(words[i].charAt(0)==words[i].charAt(1))    
                map1.put(words[i],  map1.getOrDefault(words[i],0)+1);
 
            else{
                String str= "" +words[i].charAt(1) + "" +words[i].charAt(0);
                if(map.containsKey(str) && map.get(str)>=1){
                    ans+=4;
                    map.put(str,map.get(str)-1);
                    map.put(words[i],  map.getOrDefault(words[i],0)-1);
                } 
                map.put(words[i],  map.getOrDefault(words[i],0)+1);  
            }
        }
        boolean flag=true;
        for(String x: map1.keySet()){
            int c=map1.get(x);
            if(c%2!=0) flag=false;
            
            ans+= (c/2)*4;
        }
        if(!flag) ans+=2;
        return ans;
      
    }
}
