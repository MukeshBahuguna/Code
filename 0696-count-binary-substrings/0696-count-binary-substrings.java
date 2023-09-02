class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
         char[]  arr = s.toCharArray();
         if(arr.length == 0) return 0;
         int currentCount = 1;
         int stateCount = 0;
         char state = arr[0];

         for(int i = 1; i<arr.length ; i++){
                if(state==arr[i]) {
                    currentCount++;
                    if(stateCount>=currentCount) count++;
                }
                else{
                state=arr[i];
                stateCount = currentCount;
                currentCount = 1;
                count++;
                }      
         }
        return count;
    }
}