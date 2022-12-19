class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int s=(nums[i]-1)*(nums[j]-1);
                if(s>max){
                    max=s;
                }
            }
        }
        return max;
    }
}
