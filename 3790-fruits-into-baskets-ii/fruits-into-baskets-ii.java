class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n= fruits.length;
        int ans=n;
        for (int i=0 ; i<n ; i++){
            int c=-1;
            for(int j=0 ;j<n ;j++){
                if(fruits[i]<=baskets[j] && baskets[j]!=0){
                    c=j;
                    baskets[j]=0;
                    break;
                }
            }
            if(c!=-1) ans-=1;
        }
        return ans;
    }
}