class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] a=new int[2001];
        for(int i=0;i<arr.length ;i++) a[arr[i]+1000]+=1;
        Arrays.sort(a);
        for(int i=1;i<a.length ;i++){
            if(a[i]!=0 && a[i]==a[i-1]) return false;
        }
        return true;
    }
}