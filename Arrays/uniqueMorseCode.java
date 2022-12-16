class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int n=words.length;
        
        String[] encode={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<n;i++){
            String code="";
            String temp=words[i];
            for(int j=0;j<temp.length();j++){
                int asc=(int)temp.charAt(j);
                code+=encode[asc-97];
            }
            words[i]=code;
        }
        HashSet<String> set=new HashSet(); 
        for(int i=0;i<n;i++){
            set.add(words[i]);
        }
        int a=set.size();
        return a;
    }
}
