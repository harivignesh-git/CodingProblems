class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        List<Character> res=new ArrayList<Character>();
        int count=0;
        for(int i=0;i<allowed.length();i++){
            res.add(allowed.charAt(i));
        }
        for(int i=0;i<words.length;i++){
            char[] ch=words[i].toCharArray();
            int mcount=0;
            for(int j=0;j<ch.length;j++){
                if(res.contains(ch[j])){
                    mcount++;
                }
                if(mcount==ch.length){
                    count+=1;
                }else{
                    count+=0;
                }
            }
        }
        return count;
    }
}
