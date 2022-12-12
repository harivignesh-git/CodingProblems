import java.util.*;
public class peakElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i=i+1){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);    //built-in function
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }

    }
}
