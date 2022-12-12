//This shows only the function of the code.
//This problem is solved using Kadane's Algorithm.import java.util.* ;
import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
	}

}

