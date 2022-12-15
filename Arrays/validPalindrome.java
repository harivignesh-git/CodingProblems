class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] ch=s.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<end){
            if(ch[start]==ch[end]){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
