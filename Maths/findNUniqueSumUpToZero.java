class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        for (int i=1;i<n;i+=2) {
            arr[i-1]=i;
            arr[i]=-i;
        }
        return arr;
    }
}
