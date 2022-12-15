class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int[] temp=new int[n];
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<n;i++){
            temp[i]=list.get(i);
        }
        return temp;
    }
}
