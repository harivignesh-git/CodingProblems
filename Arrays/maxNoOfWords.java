class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            String[] word=sentences[i].split(" ");
            sum=word.length;
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
