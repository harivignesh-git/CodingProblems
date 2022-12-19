class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int[][] dummy=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dummy[i][j]=image[i][n-j-1];
                                if(dummy[i][j]==0){
                    dummy[i][j]=1;
                }else{
                    dummy[i][j]=0;
                }
            }
        }
        return dummy;
    }
}
