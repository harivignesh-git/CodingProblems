class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
            String s=words[i];
            char[] ch=s.toCharArray();
            int start=0;
            int flag=1;
            int end=ch.length-1;
            while(start<=end){
                if(ch[start]!=ch[end]){
                    flag=0;
                    break;
                }
                start++;
                end--;
            }
            if(flag==1){
                return words[i];
            }
        }
        return "";
    }
}
