class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
           
                }
        int val=map.get(s.charAt(0));
        
        for(int num : map.values()){
            if(num!=val)return false;
        }
        return true;
    }
}
