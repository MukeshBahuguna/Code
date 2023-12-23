class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> s = new HashSet<>();
        s.add("0-0");
        int x=0  , y=0;
        for(int i=0 ; i<path.length() ; i++){
            char ch=path.charAt(i);
            if(ch=='N' || ch== 'S') y+= (ch=='N' ?  1 : -1);
            else x+= (ch=='E' ?  1 : -1);
            
            String ss= x+"-"+y;
            if(s.contains(ss)) return true;
            s.add(ss);
        }
        return false;
    }
}