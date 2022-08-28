class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length , m=mat[0].length;
        for (int i=0 ; i<n ;i++){
            int x=i, j=0;
            List<Integer> l= new ArrayList<>();
            while(x<n  && j<m){
                l.add(mat[x][j]);
                x+=1;
                j+=1;
            }
            Collections.sort(l);
            x=i;
            j=0;
            while(x<n  && j<m){
                mat[x][j]=l.get(j);
                x+=1;
                j+=1;
            }
            
        }
        for(int j=1; j<m ;j++){
            int x=j, i=0;
            List<Integer> l= new ArrayList<>();
            while(x<m  && i<n){
                l.add(mat[i][x]);
                x+=1;
                i+=1;
            }
            Collections.sort(l);
            x=j;
            i=0;
            while(x<m  && i<n){
                mat[i][x]=l.get(i);
                x+=1;
                i+=1;
            }    
                
        }
            
        return mat;
    }
}