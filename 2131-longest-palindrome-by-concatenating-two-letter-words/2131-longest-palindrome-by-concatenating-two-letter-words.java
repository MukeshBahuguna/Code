class Solution {
    public int longestPalindrome(String[] words) {

        Map<String, Integer> map = new HashMap<>();
        int n = words.length;
        int ans = 0;

        List<Integer> singles = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String requiredPair = getPalindromicPair(words[i]);
            if(words[i].equals(requiredPair))
                singles.add(i);
  
            if(map.containsKey(words[i]) && map.get(words[i]) > 0){
                ans += 4;
                map.put(words[i], map.get(words[i])-1);
            }
            else{
                map.put(requiredPair, map.getOrDefault(requiredPair, 0)+1);
            }
        }
        n = singles.size();
        for(int i = 0; i < n; i++){
            if(map.get(words[singles.get(i)]) > 0)
                return ans+2;
        }
        return ans;
    }

    private String getPalindromicPair(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(1));
        sb.append(s.charAt(0));
        
        return sb.toString();
    }
}