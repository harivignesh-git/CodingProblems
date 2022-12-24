class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        int n=str.length;
        String[] str2=new String[n];
        for(int i=0;i<n;i++){
            char num=str[i].charAt(str[i].length()-1);
            int k=Character.getNumericValue(num);
            str2[k-1]=str[i].substring(0,str[i].length()-1);
        }
        String out="";
        for(int i=0;i<str2.length;i++){
            out+=str2[i];
            if(i<str2.length-1){
                out+=" ";
            }
        }
        return out;
    }
}
