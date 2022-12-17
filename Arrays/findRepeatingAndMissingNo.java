import java.util.*;
public class peakElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=-1,second=-1;
        int arr[]=new int[n];
        List<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<n;i=i+1){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                first=arr[i];
            }
            res.add(arr[i]);
        }
        res.add(arr[n-1]);
        for(int i=0;i<n;i++){
            if(res.contains(i+1)==false){
                second=i+1;
            }
        }
        System.out.println(first+","+second);
    }
}
