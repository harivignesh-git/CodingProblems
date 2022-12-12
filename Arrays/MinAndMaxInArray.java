import java.util.*;
public class peakElement {
    public static void main(String[] args){
        int temp=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i=i+1){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){        //Bubble Sort
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        System.out.println("Min:"+arr[0]);   //Min element
        System.out.println("Max:"+arr[n-1]); //Max element
    }
}
