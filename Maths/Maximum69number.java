class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        return Integer.parseInt(str.replaceFirst("6", "9"));
    }
}
