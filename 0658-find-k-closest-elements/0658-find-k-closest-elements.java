class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> l= new ArrayList<>();
        int n=arr.length;
        
        int i=0 ,j=n-1;
        int ans=-1;
        while(i<=j){
            int mid= i+((j-i)/2);
            if(arr[mid]<=x){
                i=mid+1;
            }
            else j=mid-1;
        }
        j= j>=0 ? j:0;
        if(j+1<n && Math.abs(arr[j+1] - x) < Math.abs(arr[j] - x )) j=j+1;
        
        l.add(arr[j]);
        
        int forwd=j+1 , backwd=j-1;
        while(forwd<n && backwd>=0  && l.size()<k){
            if (Math.abs(arr[forwd] - x ) < Math.abs(arr[backwd] - x )) {
                l.add(arr[forwd]);
                forwd+=1;
            }
            else{
                l.add(arr[backwd]);
                backwd-=1;
            }
        }
        while(forwd<n && l.size()<k){
            l.add(arr[forwd]);
            forwd+=1;
        }
        
        while(backwd>=0  && l.size()<k){
            l.add(arr[backwd]);
            backwd-=1;
        }
               
        Collections.sort(l);
        return l;
    }
}