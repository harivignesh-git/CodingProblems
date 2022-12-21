class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int n=rectangles.length;
        int m=rectangles[0].length;
       
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                if(rectangles[i][j]<min){
                    min=rectangles[i][j];
                }
            }
            temp[i]=min;
        }
        Arrays.sort(temp);
        int count=0;
        for(int i=0;i<n;i++){
            if(temp[i]==temp[n-1]){
                count++;
            }
        }
        return count;
    }
}
