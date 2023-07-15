class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character,Integer> m =new HashMap<>();
        int max=-1;
        for(int i=0 ; i<s.length() ;i++){
            if (m.containsKey(s.charAt(i))){
                max=Math.max(max , i-m.get(s.charAt(i))-1);
            }
            else{
                m.put(s.charAt(i) , i);
            }
        }
        return max;
    }
}