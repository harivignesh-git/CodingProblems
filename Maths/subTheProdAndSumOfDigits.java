class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int prod=1;
        int sum=0;
        while(temp>0){
            int last=temp%10;
            sum+=last;
            prod*=last;
            temp/=10;
        }
        return prod-sum;
    }
}
