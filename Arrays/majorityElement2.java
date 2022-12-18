class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }
        List<Integer> list=new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            if(entry.getValue()>n/3){
                list.add(entry.getKey());

            }
        }
        return list;

        
    }
}
