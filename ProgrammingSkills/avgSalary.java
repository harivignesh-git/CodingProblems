class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        double o=(salary[0]+salary[salary.length-1])/2;
        for(int i=1;i<salary.length-1;i++){
            sum+=salary[i];
        }
        return (sum/(salary.length-2));
    }
}
