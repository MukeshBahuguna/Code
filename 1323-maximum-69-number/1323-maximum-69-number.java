class Solution {
    public int maximum69Number (int num) {
        int x=num;
        int r=0;
        while(x>0){
            r= r*10 + x%10;
            x=x/10;
        }
        // System.out.println(r);
        int t=r;
        x=0;
        int flag=0;
        while(t>0){
            if(t%10!=9 && flag==0){
                x=x*10+ 9;
                t=t/10;
                flag=1;
            }
            else{
                x=x*10+ t%10;
                t=t/10;
            }
        }
        return x;
    }
}