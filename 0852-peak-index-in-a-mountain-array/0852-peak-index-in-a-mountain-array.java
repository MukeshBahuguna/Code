class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int n=a.length;
        int i=0 , j=n-1;
        
        while(i<=j){
            int mid = i + (j-i)/2;
            if((mid==0 && a[mid] > a[mid+1]) || (mid==n-1 && a[mid] > a[mid-1] )) return mid ;
            else if(a[mid]<a[mid+1]) i=mid+1;
            else j=mid-1;
        }
        return i;
    }
}