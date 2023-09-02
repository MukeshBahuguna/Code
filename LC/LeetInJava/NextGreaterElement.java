package LC.LeetInJava;
import java.util.Stack;

public class NextGreaterElement {
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long> s= new Stack<>();
        long[] ans =new long[n];
        int i=n-1;
        while(i>=0){
            while(!s.isEmpty() && (arr[i]>=s.peek())) s.pop();

            if(s.isEmpty()) ans[i]=-1;
            else ans[i]=s.peek();
            
            s.push(arr[i]);
            i-=1;
        }
        return ans;
    } 
}

