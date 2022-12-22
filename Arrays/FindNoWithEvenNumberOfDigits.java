class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int no=nums[i];
            int temp=no;
            int c=0;
            while(no>0){
                no/=10;
                c++;
            }
            if(c%2==0){
                count++;
            }
        }
        return count;
    }
}
