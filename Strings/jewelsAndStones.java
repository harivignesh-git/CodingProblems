class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] s=jewels.toCharArray();
        char[] ch=stones.toCharArray();
        int count=0;
        for(int i=0;i<s.length;i++){
            for(int j=0;j<ch.length;j++){
                if(ch[j]==s[i]){
                    count++;
                }
            }
        }
        return count;
    }
}
