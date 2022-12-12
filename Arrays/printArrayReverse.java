import java.util.*;
public class reverseArray {
    public static void main(String[] args){
        int temp=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i=i+1){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){        //reverse array print
            System.out.println(arr[i]);
        }
    }
}
