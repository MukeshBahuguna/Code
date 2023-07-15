class Solution {
    public String customSortString(String a, String s) {
        String str= "";
        Map<Character , Integer> map = new HashMap<>();
 
        for(int i =0 ; i<s.length() ;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i =0 ; i<a.length() ;i++){
            char ch = a.charAt(i);
            while(map.containsKey(ch) && map.get(ch)>0){
                str+= ch;
                map.put(ch,map.get(ch)-1);
            }
        }
        for(int i =0 ; i<s.length() ;i++){
            char ch = s.charAt(i);
            if(map.get(ch)!=0) str+= ch;
        }
        
        return str;
        
    }
}