class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=i+2;k<n;k++){
                    if(nums[k]-nums[j]==diff && nums[j]-nums[i]==diff){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
