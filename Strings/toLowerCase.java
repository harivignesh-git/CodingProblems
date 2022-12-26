class Solution {
    public String toLowerCase(String s) {
        char[] ch=s.toCharArray();
        int n=ch.length;
        String str="";
        for(int i=0;i<n;i++){
            if((int)ch[i]<97 && Character.isAlphabetic(ch[i])){
                int no=(int)ch[i]+32;
                ch[i]=(char)no;
            }
            str+=ch[i];
        }
        return str;
    }
}
