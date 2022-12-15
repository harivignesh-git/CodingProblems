class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int str1=word1.length;
        String s1="";
        int str2=word2.length;
        String s2="";
        for(int i=0;i<str1;i++){
            s1+=word1[i];
        }
        for(int i=0;i<str2;i++){
            s2+=word2[i];
        }
        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
}
