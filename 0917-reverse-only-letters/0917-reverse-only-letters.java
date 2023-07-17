class Solution {
    public String reverseOnlyLetters(String s) {
        char[] a = s.toCharArray();
            
        for(int i=0 , j=a.length-1; i<j ; i++,j--){
            while(i<=a.length-1 && !Character.isLetter(a[i])){
                i++;
            }
             while(j>=0 && !Character.isLetter(a[j])){
                j--;
            }
            if(i<j){
                char t= a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }   
        return new String(a);
    }
}