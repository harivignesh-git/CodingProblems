//package org.skillrack;
import java.util.*;
import java.util.Collections;
public class Main {
    public static int getCount(ArrayList<Integer> lst,int num)
    {
        // max=Collections.max(lst);
        if(lst.size()==0 || lst.size()==1 )
        {
            return 1;
        }else{
            int left=0;
            int right=0;
            for(int i=0;i<lst.size();i++)
            {
                if(num<lst.get(i))
                {
                    left=left+1;
                }
                if(num>lst.get(i))
                {
                    right=right+1;
                }
            }
            if(right<=left)
            {
                return right*2+1;
            }else{
                return left*2+1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> lst=new ArrayList<Integer>();
        int total=0;
        for(int i=0;i<n;i++)
        {
            total=total+getCount(lst,arr[i]);
            lst.add(arr[i]);
            //System.out.println(total);
        }
        System.out.println(total);
    }
}
