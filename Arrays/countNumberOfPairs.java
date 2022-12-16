class Solution {
    public int countKDifference(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int a=Math.abs(nums[i]-nums[j]);
                if(a==k){
                    count++;
                }
            }
        }
        return count;
    }
}
