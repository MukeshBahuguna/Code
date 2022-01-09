package LC.LeetInJava;

import java.io.*;
import java.util.*;

public class nextGreater2 {
    public static int[] nextGreaterElementII(int[] nums) {
        //step1 --> one loop stack operations --> pop and push only
        //step2 --> another loop same as next greater to right
        //dummy input 
        // 3 -> value of n
        // 1
        // 2
        // 1

        int n=nums.length;
        Stack<Integer> stack= new Stack<>();
        int[] l =new int[n];
        for(int i=n-2 ; i>=0; i-- ){
            
            while (!stack.empty() && stack.peek()<=nums[i]){
                stack.pop();
            }
            stack.push(nums[i]);
            }
        
        for(int i=n-1 ; i>=0; i-- ){
            while (!stack.empty() && stack.peek()<=nums[i]){
                stack.pop();
            }
            if (!stack.empty()) l[i]=stack.peek();
            else l[i]=-1;

            stack.push(nums[i]);
        }
        return l;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(read.readLine());
        }
        
        int ans[] = nextGreaterElementII(nums);

        n = ans.length;

        System.out.println(n);
        for(int e: ans){
            System.out.println(e);
        }
        
    }
}