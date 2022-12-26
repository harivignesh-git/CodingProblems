class Solution {
    public String removeOuterParentheses(String s) {
        if(s==null || s.length()==0){
            return s;
        }
        StringBuilder sb=new StringBuilder();
        int start=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }else{
                count--;
            }
            if(count==0){
                sb.append(s.substring(start+1,i));
                start=i+1;
            }
            
        }
        return sb.toString();
    }
}
