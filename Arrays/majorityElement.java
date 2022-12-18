class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}
