class Solution {
    public int[] shuffle(int[] nums, int n) {
        int n1=nums.length;
        int temp[]=new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i+=2){
            temp[i]=nums[j];
            temp[i+1]=nums[n+j];
            j++;
        }
        return temp;
    }
}
