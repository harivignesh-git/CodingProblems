class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3=new int[m+n];
        int k=0;
        for(int i=0;i<m;i++){
            if(nums1[i]!=0){
                nums3[k++]=nums1[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums2[i]!=0){
                nums3[k++]=nums2[i];
            }
        }
        Arrays.sort(nums3);
        for(int i=0;i<m+n;i++){
            nums1[i]=nums3[i];
        }
    }
}
