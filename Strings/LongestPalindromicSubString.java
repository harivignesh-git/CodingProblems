class Solution {
    public String longestPalindrome(String s) {
        int max=1;
        String stw="";
        if(s.length()==1){
            return s;
        }
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                String st=palindrome(s.substring(i,j+1));
                if(st.length()>=max){
                    max=st.length();
                    stw=st;
                }
            }
        }
        if(stw==""){
            stw+=s.charAt(0);
            return stw;
        }else{
            return stw;
        }
    }
    public String palindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<=end){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }else return "";
        }
        return str;
    }
}
