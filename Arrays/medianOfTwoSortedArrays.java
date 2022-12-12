class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int temp[]=new int[n1+n2];
        System.arraycopy(nums1, 0, temp, 0, n1);
        System.arraycopy(nums2, 0, temp, n1, n2);
        Arrays.sort(temp);
        int n3=temp.length;
        if(n3%2!=0){
            return (double)temp[n3/2];
        }else{
            return (double)(temp[n3/2]+temp[(n3-1)/2])/2;
        }

    }
}
