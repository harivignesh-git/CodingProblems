class Solution {
     public static List<String> cellsInRange(String s) {
        char startChar = s.charAt(0) , endChar = s.charAt(3);
        int start = Character.getNumericValue(s.charAt(1)) ,  end = Character.getNumericValue(s.charAt(4));
        List<String> list = new ArrayList<>();
        for(char i = startChar;i <= endChar;i++){
            for (int j =start ; j <= end ; j++) {
                list.add(Character.toString(i)+j);
            }
        }
        return list;
    }
}
