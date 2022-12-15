class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum=0;
        int n=numbers.length;
        int start=0;
        int end=n-1;
        int[] temp=new int[2];
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                temp[0]=start+1;
                temp[1]=end+1;
                break;
            }else if(numbers[start]+numbers[end]<target){
                start++;
            }else{
                end--;
            }
        }
        return temp;
    }
}
