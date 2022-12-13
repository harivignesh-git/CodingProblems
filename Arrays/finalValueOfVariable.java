class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            char[] ch=operations[i].toCharArray();
            if((ch[0]=='+'&&ch[1]=='+')||(ch[1]=='+'&&ch[2]=='+')){
                x=x+1;
            }else if((ch[0]=='-'&&ch[1]=='-')||(ch[1]=='-'&&ch[2]=='-')){
                x=x-1;
            }
        }
        return x;
    }
}
