class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] s= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            
        Set<String> set=new HashSet<String>();
        for (String i : words){
            set.add(change(i,s));
        }
        return set.size();
    }
    public String change(String str,String[] s){
        String ans="";
        for (char i: str.toCharArray()){
            ans+=s[i-97];
        }
        // System.out.println(ans);
        return ans;
    }
}