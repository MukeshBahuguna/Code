class Solution {
    public String finalString(String s) {
        var flip = false;
        var list = new LinkedList<Character>();
        for (var c : s.toCharArray()){
            if (c=='i') {
                flip=!flip; 
                continue;
            } 
            if (flip) list.addFirst(c); else list.addLast(c);
        }
        var sb = new StringBuilder();
        for (var c:list) sb.append(c);
        return flip?sb.reverse().toString():sb.toString();
    }
}