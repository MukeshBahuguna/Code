class Solution {
    public int minDeletions(String s) {
        int[] a= new int[26];
        int n=s.length();
        Set<Integer> used = new HashSet<>();
        for (int i=0 ; i<n ;i++){
            a[s.charAt(i)-97]++;
        }
        int res=0;
        for (int i = 0; i < 26; ++i) {
            while (a[i] > 0 && used.contains(a[i])) {
                --a[i];
                ++res;
            }
            used.add(a[i]);
        }        
        return res;
    }
}