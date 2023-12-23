class Solution {
    public boolean isPathCrossing(String path) {
        Map<String , Integer> map = new HashMap<>();
        map.put("0-0" , -1);
        int x=0  , y=0;
        for(int i=0 ; i<path.length() ; i++){
            char ch=path.charAt(i);
            if(ch=='N' || ch== 'S') y+= (ch=='N' ?  1 : -1);
            else x+= (ch=='E' ?  1 : -1);
            
            String ss= x+"-"+y;
            if(map.containsKey(ss)) return true;
            map.put(ss , i);
        }
        return false;
    }
}