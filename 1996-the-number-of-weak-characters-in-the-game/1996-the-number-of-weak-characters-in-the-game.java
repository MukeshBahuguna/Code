class Solution {
    public int numberOfWeakCharacters(int[][] p) {
        int n=p.length;
        Arrays.sort(p, (a, b) -> (b[0] == a[0]) ? (a[1] - b[1]) : b[0] - a[0]);
        
        // for(int[] i :p){
        //     System.out.println(Arrays.toString(i));
        // }
        int c=0;
        int max=p[0][1];
        for(int i=0; i<n ;i++){
            if (p[i][1]<max) {
                c+=1;
            }
            max=Math.max(max,p[i][1]);
            
        }
        return c;
    }
}