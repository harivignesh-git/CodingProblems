class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder sb=new StringBuilder();
        key=key.replaceAll("\\s+","");
        Map<Character,Character> map=new HashMap<>();
        int i=0;
        char ch='a';
        while(map.size()<26){
            if(!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i),ch);
                ch++;
            }
            i++;
        }
        for(int j=0;j<message.length();j++){
            if(message.charAt(j)==' ')
                sb.append(" ");
            else
                sb.append(map.get(message.charAt(j)));
        }
        return sb.toString();
    }
}
