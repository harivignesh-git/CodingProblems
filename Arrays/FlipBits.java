/* Given an array A[] consisting of 0’s and 1’s. 
A flip operation is one in which you turn 1 into 0 and a 0 into 1. 
You have to do at most one “Flip” operation of any subarray. 
Formally, select a range (l, r) in the array A[], such that (0 ≤ l ≤ r < n) holds and flip the elements in this range to get the maximum ones in the final array. 
You can possibly make zero operations to get the answer.*/

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int flipBits(int[] arr,int n) {
        int zero=0,one=0,res=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
                res=Math.max(res,zero);
            }
            else{
                zero--;
                zero=Math.max(0,zero);
                one++;
            }
        }
        return one+res;
	}
}
