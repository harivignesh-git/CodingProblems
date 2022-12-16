class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
        String str1="";
        for(int i=0;i<k;i++){
            str1=str1+str[i];
            if(i!=k-1){
                str1+=" ";
            }

        }
        return str1;
    }
}
