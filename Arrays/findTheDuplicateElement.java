class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
