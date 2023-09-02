class Solution {
    public int minimumSum(int n, int k) {
//         int ans=0;
//         if(n==1) return 1; 
//         int s=(k*(k+1) )/2;  
//         int c=k;  
//         int s1=n*(n+1)/2;
//         for(int i=1 ; i<=k/2 ; i++){
//             if((k-i) != i ) {
//                 s-= (k-i) ;
//                 if(k-i < n) s1-=(k-i); 
//                 c-=1;
//             }
//             if(c==n) return s;
            
//         }
//         if(c>n) 
//         else if(c<n) for(int i=0; i<n-c ; i++) s+=k+1+i;
//         return s;
        int[] a= new int[101];
        int ans=0;
        for(int i=1 ; i<=k/2 ; i++){
            if((k-i) != i ) {
                a[k-i]=-1;
            }
        }
        int c=1 ,i=1;
        while(c<=n){
            if(a[i]!=-1) {
                ans+=i;
                c+=1;
            }
            i+=1;
        }
        return ans;
        
    }
}