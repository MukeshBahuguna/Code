class Solution {
    char[][] map ={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    
    List<String> list = new LinkedList<>();
    
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return list;
        f(digits , 0, "");
        return list;
    }
    
    
    public void f(String digits , int i , String out ) {
        if(i==digits.length()){
            list.add(out);
            return ;
        }
        int c=digits.charAt(i)- '0' ;
        for(int k=0 ; k<map[c].length ;k++){
            f( digits, i+1 , out+map[c][k]);
        }
        
    }
}