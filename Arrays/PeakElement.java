/* Find the peak element in the arrray that is greater than the elements that are adjacent to it. */

import java.util.*;
public class peakElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i=i+1){
            arr[i]=sc.nextInt();
        }
        if(arr[0]>arr[1]){
            System.out.println(arr[0]+"FirstMax"); //If first element is peak
        }
        if(arr[n-2]<arr[n-1]){
            System.out.println(arr[n-1]+"LastMax"); //If last element is max.
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                System.out.println(arr[i]+"Max"); //If peak element is in middle of the array.
            }
        }
    }
}
