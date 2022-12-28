class Solution {
    public String reversePrefix(String word, char ch) {
        String str="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                str=word.substring(0,i+1);
                break;
            }
        }
        char[] chr=str.toCharArray();
        int start=0;
        int end=chr.length-1;
        while(start<=end){
            char temp=chr[start];
            chr[start]=chr[end];
            chr[end]=temp;
            start++;
            end--;
        }
        String s2="";
        for(char i:chr){
            s2+=i;
        }
        word=word.replace(str,s2);
        return word;
    }
}
