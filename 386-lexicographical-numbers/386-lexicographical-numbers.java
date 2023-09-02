class Solution {
    List<Integer> l=new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        f(0,n);
        return l;
    }
    
    public void f(int i , int n ){
        if(i>n){
            return ;
        }
                    
        if(i!=0) l.add(i);
        for(int j=0 ; j<=9 ;j++){
            if(i==0 && j==0) continue;
            f(10*i+j , n );
        }
        
    }
    
}