class Solution {
    public String sortVowels(String s) {
        Set<Character> conSet =new HashSet<>() {{ add('a');add('e'); add('i');add('o');add('u');}};
        int n =s.length();
        char[] ss= s.toCharArray();
        List<Character> l=new ArrayList<>();
        for(int i=0 ;i<n ;i++){
            char x=Character.toLowerCase(ss[i]);
            if(conSet.contains(x)){
                l.add(ss[i]);
            }
        }
        Collections.sort(l);
        int j=0;
        for(int i=0 ;i<n ;i++){
            char x=Character.toLowerCase(ss[i]);
            if(conSet.contains(x)){
                ss[i]=l.get(j);
                j+=1;
            }
        }
        return new String(ss);
        
    }
}