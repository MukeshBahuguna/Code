class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low ; i<=high ; i++){
            c+= f(i) ? 1 :0;
        }
        return c;
    }
    public boolean f(int x) {
        int n=1;
        if(x>=10 && x<100) n=2;
        else if(x>=100 && x<1000) n=3;
        else if(x>=1000 && x<10000) n=4;
        else n=5;
            
        int c=0,c1=0;
        if(n%2==0){
            int cnt=1;
            while(x>0){
                if(cnt<=n/2) c+=x%10;
                else c1+=x%10;
                x/=10;
                cnt+=1;
            }
        }
        return c!=0 && c==c1;
        
    }
}