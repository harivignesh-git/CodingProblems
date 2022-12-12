import java.util.*;
public class peakElement {
    public static void main(String[] args){
        int temp=0;
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i=i+1){  //array input
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int j=0;j<n;j++){   //parse array 
            if(arr[j]==k){      //if match
                count++;        //count increment by 1
            }
        }
        System.out.println(count);
    }
}
