class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        int n=str.length;
        String sout="";
        for(int i=0;i<n;i++){
            sout+=revword(str[i]);
            if(i<n-1){
                sout+=" ";
            }
        }
        return sout;
    }
    public String revword(String ss){
        char[] ch=ss.toCharArray();
        int start=0;
        int end=ch.length-1;
        char temp='a';
        String sw="";
        while(start<=end){
            temp=ch[end];
            ch[end]=ch[start];
            ch[start]=temp;
            end--;
            start++;
        }
        for(int i=0;i<ch.length;i++){
            sw+=ch[i];
        }
        return sw;
    }
}
