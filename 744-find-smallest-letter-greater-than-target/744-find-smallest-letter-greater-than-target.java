class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int i=0 ,j=n;
        while (i<j){
            int mid=(i+j)/2;
            if(letters[mid]<=target){
                i=mid+1;
            }
            else j=mid;
        }
        return j>=n ? letters[0] : (letters[j]>target ? letters[j] : (j+1 >=n ? letters[0]: letters[j+1]));
    }
}